package in.nit.contact.dto;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

@Data
public class Contact implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer contId;
	private String contName;
	private String contEmail;
	private Long contMobile;
	private Date  createdDate;
	private Date updateDate;
}
