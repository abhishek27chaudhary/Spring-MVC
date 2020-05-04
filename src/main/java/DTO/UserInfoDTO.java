package DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {
	
	@NotBlank(message="*Username Invalid")
	private String UserName;
	@Size(min = 3, max = 15, message = "Username should be 3-15 char")
	private String CrushName;
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getCrushName() {
		return CrushName;
	}
	public void setCrushName(String crushName) {
		CrushName = crushName;
	}
	

}
