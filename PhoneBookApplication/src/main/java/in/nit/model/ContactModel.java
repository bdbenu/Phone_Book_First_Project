package in.nit.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
@Data
@Entity
@Table(name = "CONTACT_DB")
public class ContactModel {
	@Id
	@Column(name = "CONTACT_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer contId;
	@Column(name = "CONTACT_NAME")
	private String contName;
	@Column(name = "CONTACT_EMAIL")
	private String contEmail;
	@Column(name = "CONTACT_MOBILE")
	private Long contMobile;
	@Temporal(TemporalType.DATE)
	@CreationTimestamp
	@Column(name = "CONTACT_CREATE_DATE",updatable = false)
	private Date  createdDate;
	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name = "CONTACT_UPDATE_DATE")
	private Date updateDate;



}
