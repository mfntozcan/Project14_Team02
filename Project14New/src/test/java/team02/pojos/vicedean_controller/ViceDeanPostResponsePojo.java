package team02.pojos.vicedean_controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)

public class ViceDeanPostResponsePojo implements Serializable {
	private ObjectPojo object;
	private String message;
	private String httpStatus;

	public ViceDeanPostResponsePojo() {

	}

	public ViceDeanPostResponsePojo(ObjectPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(ObjectPojo object){
		this.object = object;
	}

	public ObjectPojo getObject(){
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
			"ViceDeanPostResponsePojo{" +
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}