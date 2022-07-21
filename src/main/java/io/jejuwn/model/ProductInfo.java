package io.jejuwn.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="product_info")
@Entity(name="ProductInfo")
public class ProductInfo {
	
	@Id
	@Column(unique=true, nullable=false)
    private Long id;
    
	@MapsId
	@OneToOne(fetch = FetchType.LAZY, targetEntity=Product.class)
	@JoinColumn(name="id")
	private Product product;
	
	@Column
    private String content;
	@Column
    private String contentExtra;
	@Column
    private Date regdate;
	@Column
    private Date updatedate;
	@Column
    private Date startTime;
	@Column
    private Date endTime;
	@Column
    private Long hit;
	@Column
    private Long maxCapacity;
	@Column
    private String address;

    
}