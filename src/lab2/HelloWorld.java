package lab2;

public class HelloWorld {
	private String message;
	public String getMessage(){
		return message;
	}
	public void setMessage(String message){
		this.message = message;
	}
	public String execute(){
		if(getMessage().isEmpty()){
			return "error";
		}
		else{
			return "success";
		}
	}
}
