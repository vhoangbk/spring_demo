package hoang.hut.model.response;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * トークンレスポンスDto
 * 
 * @author yu-ishi
 *
 */
@JsonRootName("response")
public class ResponseTokenDto {

	/**
	 * トークン
	 */
	@JsonProperty("token")
	private String token;

	/**
	 * トークンを取得します。
	 * @return トークン
	 */
	public String getToken() {
		return token;
	}

	/**
	 * トークンを設定します。
	 * @param token トークン
	 */
	public void setToken(String token) {
		this.token = token;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
	}
}
