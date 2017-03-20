package com.admin.domain.modle;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Jonsy
 * 用户
 *
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 主键ID */
	private String id = UUID.randomUUID().toString();

	/** 登录名称 */
	private String user_name;

	/** 密码 */
	private String password;

	/**密码加密的盐*/
	private String salt;

	/** 邮箱 */
	private String email;

	/** 是否禁用 */
	private boolean disabled;

	/** 创建时间 */
	private Date create_time;

	/** 最后登录时间 */
	private Date last_time;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getLast_time() {
		return last_time;
	}

	public void setLast_time(Date last_time) {
		this.last_time = last_time;
	}

	public boolean isRoot(){
		return "root".equals(user_name);
	}
}
