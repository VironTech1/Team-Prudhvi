package Com;

public class Meeting {
 String url;
 String time;
 String Host;
 Person p=new Person();
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public String getHost() {
	return Host;
}
public void setHost(String host) {
	Host = host;
}


public void diaplyDetails()
{
	System.out.println("url:"+url);
	System.out.println("time:"+time);
	System.out.println("host:"+Host);
	System.out.println("Participant Name:"+p.name);
	System.out.println("Participant Phone:"+p.phone);
	System.out.println("Participant Address:"+p.addr);
}
 
 
 
}
