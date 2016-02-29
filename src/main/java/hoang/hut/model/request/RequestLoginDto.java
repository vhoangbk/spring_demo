package hoang.hut.model.request;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ログインリクエストDto
 * 
 * @author tdhay_000
 *
 */
public class RequestLoginDto implements Serializable {

	private static final long serialVersionUID = -6549744670443251776L;
	
	/**
	 * 端末ID
	 */
	@JsonProperty("device_id")
	private String deviceId;
	
	/**
	 * アプリID
	 */
	@JsonProperty("app_id")
	private String appId;
	
	/**
	 * アカウント（メールアドレス）
	 */
	@JsonProperty("email")
	private String email;
	
	/**
	 * パスワード
	 */
	@JsonProperty("password")
	private String password;
	
	/**
	 * アプリバージョン
	 */
	@JsonProperty("app_version")
	private String appVersion;

	/**
	 * プッシュID
	 */
	@JsonProperty("registration_id")
	private String registrationId;

	/**
	 * deviceId を取得する。
	 * @return deviceId
	 */
	public String getDeviceId() {
		return deviceId;
	}

	/**
	 * deviceId を設定する。
	 * @param deviceId
	 */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	/**
	 * appId を取得する。
	 * @return appId
	 */
	public String getAppId() {
		return appId;
	}

	/**
	 * appId を設定する。
	 * @param appId
	 */
	public void setAppId(String appId) {
		this.appId = appId;
	}

	/**
	 * email を取得する。
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * email を設定する。
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * password を取得する。
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * password を設定する。
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * appVersion を取得する。
	 * @return appVersion
	 */
	public String getAppVersion() {
		return appVersion;
	}

	/**
	 * appVersion を設定する。
	 * @param appVersion
	 */
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	/**
	 * registrationId を取得する。
	 * @return registrationId
	 */
	public String getRegistrationId() {
		return registrationId;
	}

	/**
	 * registrationId を設定する。
	 * @param registrationId
	 */
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
	}

}
