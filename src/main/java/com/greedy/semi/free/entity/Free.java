package com.greedy.semi.free.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "FREE")
@SequenceGenerator(name = "FREE_SEQ_GENERATOR", sequenceName = "SEQ_FREE_NO", initialValue = 1, allocationSize = 1)
@DynamicInsert
public class Free {
	@Id
	@Column(name = "FREE_NO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FREE_SEQ_GENERATOR")
	private Long freeNo;
	
	@Column(name = "FREE_TITLE")
	private String freeTitle;
	
	@Column(name = "FREE_CONTENT")
	private String freeContent;

	@Column(name = "FREE_DELETE")
	private String freeDelete;
	
	@Column(name = "FREE_DATE")
	private Date freeDate;
	
	@Column(name = "FREE_UPDATE")
	private Date freeUpdate;	
	
	@Column(name = "FREE_COUNT")
	private int freeCount;
	
	@Column(name = "FREE_TYPE")
	private Integer freeType;
	
	@Column(name = "FREE_STATUS")
	private String freeStatus;
}