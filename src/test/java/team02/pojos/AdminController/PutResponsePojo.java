package team02.pojos.AdminController;

import java.io.Serializable;

public class PutResponsePojo implements Serializable {
	private String httpStatus;
	private String message;
	private PutObjectPojo object;

	public PutResponsePojo() {
	}

	public PutResponsePojo(String httpStatus, String message, PutObjectPojo object) {
		this.httpStatus = httpStatus;
		this.message = message;
		this.object = object;
	}

	public void setHttpStatus(String httpStatus){
		this.httpStatus = httpStatus;
	}

	public String getHttpStatus(){
		return httpStatus;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setObject(PutObjectPojo object){
		this.object = object;
	}

	public PutObjectPojo getObject(){
		return object;
	}

	@Override
 	public String toString(){
		return 
			"DeanPutPojo{" + 
			"httpStatus = '" + httpStatus + '\'' + 
			",message = '" + message + '\'' + 
			",object = '" + object + '\'' + 
			"}";
		}
}