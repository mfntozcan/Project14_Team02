package team02.pojos.adminControllerYusuf;

import java.io.Serializable;

public class GetResponsePojo implements Serializable {
	private GetDeanPojo object;
	private String message;
	private String httpStatus;

	public GetResponsePojo() {
	}

	public GetResponsePojo(GetDeanPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(GetDeanPojo object){
		this.object = object;
	}

	public GetDeanPojo getObject(){
		return object;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setHttpStatus(String httpStatus){
		this.httpStatus = httpStatus;
	}

	public String getHttpStatus(){
		return httpStatus;
	}

	@Override
 	public String toString(){
		return 
			"DeanGetPojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}