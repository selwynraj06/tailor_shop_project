package com.tailoring.tailoring_shop.measurement.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "half_pant_measurement")
public class HalfPantMeasurement {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
		
		@OneToOne
		@JoinColumn(name = "measurement_id",unique = true,nullable = false)
		private Measurement measurement;
		
	    private Double height;
	    private Double fork;
	    private Double waist;
	    private Double seat;
	    
	    private String style;
	    private String size1;
	    private String size2;
	    
	    @Column(name = "side_stitch")
	    private String sideStitch;
	    
	    @Column(name = "pocket_size")
	    private String pocketSize;
	    
	    @Column(name = "back_pocket_count")
	    private int  backPocketCount;
	    private int loops;
	    private String remarks;


		public HalfPantMeasurement() {
			super();
			// TODO Auto-generated constructor stub
		}

		public HalfPantMeasurement(Long id,Measurement measurement,  Double height, Double fork, Double waist, Double seat, String style,
				String size1, String size2, String sideStitch, String pocketSize, int backPocketCount, int loops,
				String remarks) {
			super();
			this.id = id;
			this.measurement = measurement;
			this.height = height;
			this.fork = fork;
			this.waist = waist;
			this.seat = seat;
			this.style = style;
			this.size1 = size1;
			this.size2 = size2;
			this.sideStitch = sideStitch;
			this.pocketSize = pocketSize;
			this.backPocketCount = backPocketCount;
			this.loops = loops;
			this.remarks = remarks;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}
		
		public Measurement getMeasurement() {
		    return measurement;
		}

		public void setMeasurement(Measurement measurement) {
		    this.measurement = measurement;
		}

		public Double getHeight() {
			return height;
		}

		public void setHeight(Double height) {
			this.height = height;
		}

		public Double getFork() {
			return fork;
		}

		public void setFork(Double fork) {
			this.fork = fork;
		}

		public Double getWaist() {
			return waist;
		}

		public void setWaist(Double waist) {
			this.waist = waist;
		}

		public Double getSeat() {
			return seat;
		}

		public void setSeat(Double seat) {
			this.seat = seat;
		}

		public String getStyle() {
			return style;
		}

		public void setStyle(String style) {
			this.style = style;
		}

		public String getSize1() {
			return size1;
		}

		public void setSize1(String size1) {
			this.size1 = size1;
		}

		public String getSize2() {
			return size2;
		}

		public void setSize2(String size2) {
			this.size2 = size2;
		}

		public String getSideStitch() {
			return sideStitch;
		}

		public void setSideStitch(String sideStitch) {
			this.sideStitch = sideStitch;
		}

		public String getPocketSize() {
			return pocketSize;
		}

		public void setPocketSize(String pocketSize) {
			this.pocketSize = pocketSize;
		}

		public int getBackPocketCount() {
			return backPocketCount;
		}

		public void setBackPocketCount(int backPocketCount) {
			this.backPocketCount = backPocketCount;
		}

		public int getLoops() {
			return loops;
		}

		public void setLoops(int loops) {
			this.loops = loops;
		}

		public String getRemarks() {
			return remarks;
		}

		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}
	    
}
