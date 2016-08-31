import java.util.List;

import org.openqa.selenium.WebDriver;

import com.jaunt.Element;
import com.jaunt.Elements;
import com.jaunt.Node;
import com.jaunt.NotFound;
import com.jaunt.ResponseException;
import com.jaunt.UserAgent;

public class ComicPage {

	UserAgent userAgent; 
	

	private String url; 
	private String link_one; 
	private String link_two;
	protected String safelink_converter = "*removed*";
	
	
	public ComicPage(){
		userAgent = new UserAgent(); 	
	}
		
	public void GetDownloadLinks(String url){
		try {
			userAgent.visit(url);
			link_one = safelink_converter + getLinkDetails(userAgent.doc.findFirst("<a class=\"aio-red\"").toString());
			link_two = safelink_converter + getLinkDetails(userAgent.doc.findFirst("<a class=\"aio-blue\"").toString());
			//System.out.println(link_one + "\n" + link_two);
		} catch (ResponseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	private String getLinkDetails(String url){
		return url.substring(url.indexOf("id="), url.indexOf(" rel"));
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLink_one() {
		return link_one;
	}

	public String getLink_two() {
		return link_two;
	}


	
	
	
}
