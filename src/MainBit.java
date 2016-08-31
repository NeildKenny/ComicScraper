import java.awt.SystemTray;
import java.util.ArrayList;
import java.util.List;

import com.jaunt.*;

class MainBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		String url = "*removed*"; 
		
		String find = "<ul id=\"lcp_instance_0\" class=\"lcp_catlist\">"; 

		int i = 0;
		
	
		
		//getComicChrome.VisitPage();
		
		
			UserAgent userAgent = new UserAgent();
			try {
				userAgent.visit(url);
				List<Node> comicListNode = userAgent.doc.findFirst(find).getChildNodes();
				
				List<ComicModel> comicModel = new ArrayList<ComicModel>();
				
				GetComicChrome getComicChrome = new GetComicChrome(); 

				
				for( Node node : comicListNode ){
					System.out.println(i);
					
					if( node.getType() == Node.ELEMENT_TYPE ){
						//System.out.println( ((Element)node).outerHTML());

						String element = ((Element)node).outerHTML();
						
						String[] element_split = element.split("\"");
						
						String comic_page_url = element_split[1] ; 
						String title = element_split[3];
						
						ComicPage comicPage = new ComicPage(); 
						comicPage.GetDownloadLinks(comic_page_url);
						//System.out.println(url2);
			
						ComicModel comicDataModel = new ComicModel(comic_page_url, title, comicPage.getLink_one(), comicPage.getLink_two()); 
					
						comicModel.add(comicDataModel);
						System.out.println(i + " current link:" + comicPage.getLink_one());

						getComicChrome.VisitPage(comicPage.getLink_one());
						i++;

					}
					if(i == 5){
						Thread.sleep(0);
						getComicChrome.driver.close();
					}
				}
			} catch (ResponseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NotFound e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		

		

		
	}

}
