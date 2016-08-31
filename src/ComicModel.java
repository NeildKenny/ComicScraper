
public class ComicModel {

	String url; 
	String title; 
	String decrpyt_url_1;
	String decrypt_url_2;
	
	public ComicModel(String url, String title, String decrpyt_url_1, String decrypt_url_2) {
		super();
		this.url = url;
		this.title = title;
		this.decrpyt_url_1 = decrpyt_url_1;
		this.decrypt_url_2 = decrypt_url_2;
	}
	
	public ComicModel(String url, String title) {
		super();
		this.url = url;
		this.title = title;

	}
	
	
	public String getDecrpyt_url_1() {
		return decrpyt_url_1;
	}
	public void setDecrpyt_url_1(String decrpyt_url_1) {
		this.decrpyt_url_1 = decrpyt_url_1;
	}
	public String getDecrypt_url_2() {
		return decrypt_url_2;
	}
	public void setDecrypt_url_2(String decrypt_url_2) {
		this.decrypt_url_2 = decrypt_url_2;
	}

	
	
	

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	
	
	
	
}
