package net.devstudy.resume.form;

import net.devstudy.resume.annotation.EnableFormErrorConversion;
import net.devstudy.resume.annotation.constraints.FieldMatch;
import net.devstudy.resume.annotation.constraints.PasswordStrength;

@FieldMatch(first = "password", second = "confirmPassword", message = "The password fields must match")
@EnableFormErrorConversion(formName="passwordForm", fieldReference="confirmPassword", validationAnnotationClass=FieldMatch.class)
public class PasswordForm {

	@PasswordStrength
	private String password;
	
	private String confirmPassword;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
}
