package com.software3.hors.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "week_schedule")
@DynamicInsert(true)
@DynamicUpdate(true)
public class WeekSchedule {

	public static int TIMECOUNT = 14 * 7;
	@Id
	@Column(name = "wsid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long wsid;

	@OneToOne()
	@JoinColumn(name = "docid", referencedColumnName = "docid")
	private Doctor Doctor;
	// 以数组的方式存放所有时间段的可看病总人数
	@Transient
	private int[] total;
	// 以数组存放所有时间段可看病的剩余人数
	@Transient
	private int[] remain;

	// 周一
	@Column(name = "monday_t8_total", columnDefinition = "int(3) default 0")
	private int mondayT8Total;

	@Column(name = "monday_t8_remain", columnDefinition = "int(3) default 0")
	private int mondayT8Remain;

	@Column(name = "monday_t9_total", columnDefinition = "int(3) default 0")
	private int mondayT9Total;
	@Column(name = "monday_t9_remain", columnDefinition = "int(3) default 0")
	private int mondayT9Remain;

	@Column(name = "monday_t10_total", columnDefinition = "int(3) default 0")
	private int mondayT10Total;
	@Column(name = "monday_t10_remain", columnDefinition = "int(3) default 0")
	private int mondayT10Remain;

	@Column(name = "monday_t11_total", columnDefinition = "int(3) default 0")
	private int mondayT11Total;
	@Column(name = "monday_t11_remain", columnDefinition = "int(3) default 0")
	private int mondayT11Remain;

	@Column(name = "monday_t12_total", columnDefinition = "int(3) default 0")
	private int mondayT12Total;
	@Column(name = "monday_t12_remain", columnDefinition = "int(3) default 0")
	private int mondayT12Remain;

	@Column(name = "monday_t13_total", columnDefinition = "int(3) default 0")
	private int mondayT13Total;
	@Column(name = "monday_t13_remain", columnDefinition = "int(3) default 0")
	private int mondayT13Remain;

	@Column(name = "monday_t14_total", columnDefinition = "int(3) default 0")
	private int mondayT14Total;
	@Column(name = "monday_t14_remain", columnDefinition = "int(3) default 0")
	private int mondayT14Remain;

	@Column(name = "monday_t15_total", columnDefinition = "int(3) default 0")
	private int mondayT15Total;
	@Column(name = "monday_t15_remain", columnDefinition = "int(3) default 0")
	private int mondayT15Remain;

	@Column(name = "monday_t16_total", columnDefinition = "int(3) default 0")
	private int mondayT16Total;
	@Column(name = "monday_t16_remain", columnDefinition = "int(3) default 0")
	private int mondayT16Remain;

	@Column(name = "monday_t17_total", columnDefinition = "int(3) default 0")
	private int mondayT17Total;
	@Column(name = "monday_t17_remain", columnDefinition = "int(3) default 0")
	private int mondayT17Remain;

	@Column(name = "monday_t18_total", columnDefinition = "int(3) default 0")
	private int mondayT18Total;
	@Column(name = "monday_t18_remain", columnDefinition = "int(3) default 0")
	private int mondayT18Remain;

	@Column(name = "monday_t19_total", columnDefinition = "int(3) default 0")
	private int mondayT19Total;
	@Column(name = "monday_t19_remain", columnDefinition = "int(3) default 0")
	private int mondayT19Remain;

	@Column(name = "monday_t20_total", columnDefinition = "int(3) default 0")
	private int mondayT20Total;
	@Column(name = "monday_t20_remain", columnDefinition = "int(3) default 0")
	private int mondayT20Remain;

	@Column(name = "monday_t21_total", columnDefinition = "int(3) default 0")
	private int mondayT21Total;
	@Column(name = "monday_t21_remain", columnDefinition = "int(3) default 0")
	private int mondayT21Remain;
	// 周二

	@Column(name = "thuesday_t8_total", columnDefinition = "int(3) default 0")
	private int thuesdayT8Total;

	@Column(name = "thuesday_t8_remain", columnDefinition = "int(3) default 0")
	private int thuesdayT8Remain;

	@Column(name = "thuesday_t9_total", columnDefinition = "int(3) default 0")
	private int thuesdayT9Total;
	@Column(name = "thuesday_t9_remain", columnDefinition = "int(3) default 0")
	private int thuesdayT9Remain;

	@Column(name = "thuesday_t10_total", columnDefinition = "int(3) default 0")
	private int thuesdayT10Total;
	@Column(name = "thuesday_t10_remain", columnDefinition = "int(3) default 0")
	private int thuesdayT10Remain;

	@Column(name = "thuesday_t11_total", columnDefinition = "int(3) default 0")
	private int thuesdayT11Total;
	@Column(name = "thuesday_t11_remain", columnDefinition = "int(3) default 0")
	private int thuesdayT11Remain;

	@Column(name = "thuesday_t12_total", columnDefinition = "int(3) default 0")
	private int thuesdayT12Total;
	@Column(name = "thuesday_t12_remain", columnDefinition = "int(3) default 0")
	private int thuesdayT12Remain;

	@Column(name = "thuesday_t13_total", columnDefinition = "int(3) default 0")
	private int thuesdayT13Total;
	@Column(name = "thuesday_t13_remain", columnDefinition = "int(3) default 0")
	private int thuesdayT13Remain;

	@Column(name = "thuesday_t14_total", columnDefinition = "int(3) default 0")
	private int thuesdayT14Total;
	@Column(name = "thuesday_t14_remain", columnDefinition = "int(3) default 0")
	private int thuesdayT14Remain;

	@Column(name = "thuesday_t15_total", columnDefinition = "int(3) default 0")
	private int thuesdayT15Total;
	@Column(name = "thuesday_t15_remain", columnDefinition = "int(3) default 0")
	private int thuesdayT15Remain;

	@Column(name = "thuesday_t16_total", columnDefinition = "int(3) default 0")
	private int thuesdayT16Total;
	@Column(name = "thuesday_t16_remain", columnDefinition = "int(3) default 0")
	private int thuesdayT16Remain;

	@Column(name = "thuesday_t17_total", columnDefinition = "int(3) default 0")
	private int thuesdayT17Total;
	@Column(name = "thuesday_t17_remain", columnDefinition = "int(3) default 0")
	private int thuesdayT17Remain;

	@Column(name = "thuesday_t18_total", columnDefinition = "int(3) default 0")
	private int thuesdayT18Total;
	@Column(name = "thuesday_t18_remain", columnDefinition = "int(3) default 0")
	private int thuesdayT18Remain;

	@Column(name = "thuesday_t19_total", columnDefinition = "int(3) default 0")
	private int thuesdayT19Total;
	@Column(name = "thuesday_t19_remain", columnDefinition = "int(3) default 0")
	private int thuesdayT19Remain;

	@Column(name = "thuesday_t20_total", columnDefinition = "int(3) default 0")
	private int thuesdayT20Total;
	@Column(name = "thuesday_t20_remain", columnDefinition = "int(3) default 0")
	private int thuesdayT20Remain;

	@Column(name = "thuesday_t21_total", columnDefinition = "int(3) default 0")
	private int thuesdayT21Total;
	@Column(name = "thuesday_t21_remain", columnDefinition = "int(3) default 0")
	private int thuesdayT21Remain;
	// 周三
	@Column(name = "wednesday_t8_total", columnDefinition = "int(3) default 0")
	private int wednesdayT8Total;

	@Column(name = "wednesday_t8_remain", columnDefinition = "int(3) default 0")
	private int wednesdayT8Remain;

	@Column(name = "wednesday_t9_total", columnDefinition = "int(3) default 0")
	private int wednesdayT9Total;
	@Column(name = "wednesday_t9_remain", columnDefinition = "int(3) default 0")
	private int wednesdayT9Remain;

	@Column(name = "wednesday_t10_total", columnDefinition = "int(3) default 0")
	private int wednesdayT10Total;
	@Column(name = "wednesday_t10_remain", columnDefinition = "int(3) default 0")
	private int wednesdayT10Remain;

	@Column(name = "wednesday_t11_total", columnDefinition = "int(3) default 0")
	private int wednesdayT11Total;
	@Column(name = "wednesday_t11_remain", columnDefinition = "int(3) default 0")
	private int wednesdayT11Remain;

	@Column(name = "wednesday_t12_total", columnDefinition = "int(3) default 0")
	private int wednesdayT12Total;
	@Column(name = "wednesday_t12_remain", columnDefinition = "int(3) default 0")
	private int wednesdayT12Remain;

	@Column(name = "wednesday_t13_total", columnDefinition = "int(3) default 0")
	private int wednesdayT13Total;
	@Column(name = "wednesday_t13_remain", columnDefinition = "int(3) default 0")
	private int wednesdayT13Remain;

	@Column(name = "wednesday_t14_total", columnDefinition = "int(3) default 0")
	private int wednesdayT14Total;
	@Column(name = "wednesday_t14_remain", columnDefinition = "int(3) default 0")
	private int wednesdayT14Remain;

	@Column(name = "wednesday_t15_total", columnDefinition = "int(3) default 0")
	private int wednesdayT15Total;
	@Column(name = "wednesday_t15_remain", columnDefinition = "int(3) default 0")
	private int wednesdayT15Remain;

	@Column(name = "wednesday_t16_total", columnDefinition = "int(3) default 0")
	private int wednesdayT16Total;
	@Column(name = "wednesday_t16_remain", columnDefinition = "int(3) default 0")
	private int wednesdayT16Remain;

	@Column(name = "wednesday_t17_total", columnDefinition = "int(3) default 0")
	private int wednesdayT17Total;
	@Column(name = "wednesday_t17_remain", columnDefinition = "int(3) default 0")
	private int wednesdayT17Remain;

	@Column(name = "wednesday_t18_total", columnDefinition = "int(3) default 0")
	private int wednesdayT18Total;
	@Column(name = "wednesday_t18_remain", columnDefinition = "int(3) default 0")
	private int wednesdayT18Remain;

	@Column(name = "wednesday_t19_total", columnDefinition = "int(3) default 0")
	private int wednesdayT19Total;
	@Column(name = "wednesday_t19_remain", columnDefinition = "int(3) default 0")
	private int wednesdayT19Remain;

	@Column(name = "wednesday_t20_total", columnDefinition = "int(3) default 0")
	private int wednesdayT20Total;
	@Column(name = "wednesday_t20_remain", columnDefinition = "int(3) default 0")
	private int wednesdayT20Remain;

	@Column(name = "wednesday_t21_total", columnDefinition = "int(3) default 0")
	private int wednesdayT21Total;
	@Column(name = "wednesday_t21_remain", columnDefinition = "int(3) default 0")
	private int wednesdayT21Remain;

	// 周四

	@Column(name = "thursday_t8_total", columnDefinition = "int(3) default 0")
	private int thursdayT8Total;

	@Column(name = "thursday_t8_remain", columnDefinition = "int(3) default 0")
	private int thursdayT8Remain;

	@Column(name = "thursday_t9_total", columnDefinition = "int(3) default 0")
	private int thursdayT9Total;
	@Column(name = "thursday_t9_remain", columnDefinition = "int(3) default 0")
	private int thursdayT9Remain;

	@Column(name = "thursday_t10_total", columnDefinition = "int(3) default 0")
	private int thursdayT10Total;
	@Column(name = "thursday_t10_remain", columnDefinition = "int(3) default 0")
	private int thursdayT10Remain;

	@Column(name = "thursday_t11_total", columnDefinition = "int(3) default 0")
	private int thursdayT11Total;
	@Column(name = "thursday_t11_remain", columnDefinition = "int(3) default 0")
	private int thursdayT11Remain;

	@Column(name = "thursday_t12_total", columnDefinition = "int(3) default 0")
	private int thursdayT12Total;
	@Column(name = "thursday_t12_remain", columnDefinition = "int(3) default 0")
	private int thursdayT12Remain;

	@Column(name = "thursday_t13_total", columnDefinition = "int(3) default 0")
	private int thursdayT13Total;
	@Column(name = "thursday_t13_remain", columnDefinition = "int(3) default 0")
	private int thursdayT13Remain;

	@Column(name = "thursday_t14_total", columnDefinition = "int(3) default 0")
	private int thursdayT14Total;
	@Column(name = "thursday_t14_remain", columnDefinition = "int(3) default 0")
	private int thursdayT14Remain;

	@Column(name = "thursday_t15_total", columnDefinition = "int(3) default 0")
	private int thursdayT15Total;
	@Column(name = "thursday_t15_remain", columnDefinition = "int(3) default 0")
	private int thursdayT15Remain;

	@Column(name = "thursday_t16_total", columnDefinition = "int(3) default 0")
	private int thursdayT16Total;
	@Column(name = "thursday_t16_remain", columnDefinition = "int(3) default 0")
	private int thursdayT16Remain;

	@Column(name = "thursday_t17_total", columnDefinition = "int(3) default 0")
	private int thursdayT17Total;
	@Column(name = "thursday_t17_remain", columnDefinition = "int(3) default 0")
	private int thursdayT17Remain;

	@Column(name = "thursday_t18_total", columnDefinition = "int(3) default 0")
	private int thursdayT18Total;
	@Column(name = "thursday_t18_remain", columnDefinition = "int(3) default 0")
	private int thursdayT18Remain;

	@Column(name = "thursday_t19_total", columnDefinition = "int(3) default 0")
	private int thursdayT19Total;
	@Column(name = "thursday_t19_remain", columnDefinition = "int(3) default 0")
	private int thursdayT19Remain;

	@Column(name = "thursday_t20_total", columnDefinition = "int(3) default 0")
	private int thursdayT20Total;
	@Column(name = "thursday_t20_remain", columnDefinition = "int(3) default 0")
	private int thursdayT20Remain;

	@Column(name = "thursday_t21_total", columnDefinition = "int(3) default 0")
	private int thursdayT21Total;
	@Column(name = "thursday_t21_remain", columnDefinition = "int(3) default 0")
	private int thursdayT21Remain;
	// 周五

	@Column(name = "friday_t8_total", columnDefinition = "int(3) default 0")
	private int fridayT8Total;

	@Column(name = "friday_t8_remain", columnDefinition = "int(3) default 0")
	private int fridayT8Remain;

	@Column(name = "friday_t9_total", columnDefinition = "int(3) default 0")
	private int fridayT9Total;
	@Column(name = "friday_t9_remain", columnDefinition = "int(3) default 0")
	private int fridayT9Remain;

	@Column(name = "friday_t10_total", columnDefinition = "int(3) default 0")
	private int fridayT10Total;
	@Column(name = "friday_t10_remain", columnDefinition = "int(3) default 0")
	private int fridayT10Remain;

	@Column(name = "friday_t11_total", columnDefinition = "int(3) default 0")
	private int fridayT11Total;
	@Column(name = "friday_t11_remain", columnDefinition = "int(3) default 0")
	private int fridayT11Remain;

	@Column(name = "friday_t12_total", columnDefinition = "int(3) default 0")
	private int fridayT12Total;
	@Column(name = "friday_t12_remain", columnDefinition = "int(3) default 0")
	private int fridayT12Remain;

	@Column(name = "friday_t13_total", columnDefinition = "int(3) default 0")
	private int fridayT13Total;
	@Column(name = "friday_t13_remain", columnDefinition = "int(3) default 0")
	private int fridayT13Remain;

	@Column(name = "friday_t14_total", columnDefinition = "int(3) default 0")
	private int fridayT14Total;
	@Column(name = "friday_t14_remain", columnDefinition = "int(3) default 0")
	private int fridayT14Remain;

	@Column(name = "friday_t15_total", columnDefinition = "int(3) default 0")
	private int fridayT15Total;
	@Column(name = "friday_t15_remain", columnDefinition = "int(3) default 0")
	private int fridayT15Remain;

	@Column(name = "friday_t16_total", columnDefinition = "int(3) default 0")
	private int fridayT16Total;
	@Column(name = "friday_t16_remain", columnDefinition = "int(3) default 0")
	private int fridayT16Remain;

	@Column(name = "friday_t17_total", columnDefinition = "int(3) default 0")
	private int fridayT17Total;
	@Column(name = "friday_t17_remain", columnDefinition = "int(3) default 0")
	private int fridayT17Remain;

	@Column(name = "friday_t18_total", columnDefinition = "int(3) default 0")
	private int fridayT18Total;
	@Column(name = "friday_t18_remain", columnDefinition = "int(3) default 0")
	private int fridayT18Remain;

	@Column(name = "friday_t19_total", columnDefinition = "int(3) default 0")
	private int fridayT19Total;
	@Column(name = "friday_t19_remain", columnDefinition = "int(3) default 0")
	private int fridayT19Remain;

	@Column(name = "friday_t20_total", columnDefinition = "int(3) default 0")
	private int fridayT20Total;
	@Column(name = "friday_t20_remain", columnDefinition = "int(3) default 0")
	private int fridayT20Remain;

	@Column(name = "friday_t21_total", columnDefinition = "int(3) default 0")
	private int fridayT21Total;
	@Column(name = "friday_t21_remain", columnDefinition = "int(3) default 0")
	private int fridayT21Remain;
	// 周六

	@Column(name = "saturday_t8_total", columnDefinition = "int(3) default 0")
	private int saturdayT8Total;

	@Column(name = "saturday_t8_remain", columnDefinition = "int(3) default 0")
	private int saturdayT8Remain;

	@Column(name = "saturday_t9_total", columnDefinition = "int(3) default 0")
	private int saturdayT9Total;
	@Column(name = "saturday_t9_remain", columnDefinition = "int(3) default 0")
	private int saturdayT9Remain;

	@Column(name = "saturday_t10_total", columnDefinition = "int(3) default 0")
	private int saturdayT10Total;
	@Column(name = "saturday_t10_remain", columnDefinition = "int(3) default 0")
	private int saturdayT10Remain;

	@Column(name = "saturday_t11_total", columnDefinition = "int(3) default 0")
	private int saturdayT11Total;
	@Column(name = "saturday_t11_remain", columnDefinition = "int(3) default 0")
	private int saturdayT11Remain;

	@Column(name = "saturday_t12_total", columnDefinition = "int(3) default 0")
	private int saturdayT12Total;
	@Column(name = "saturday_t12_remain", columnDefinition = "int(3) default 0")
	private int saturdayT12Remain;

	@Column(name = "saturday_t13_total", columnDefinition = "int(3) default 0")
	private int saturdayT13Total;
	@Column(name = "saturday_t13_remain", columnDefinition = "int(3) default 0")
	private int saturdayT13Remain;

	@Column(name = "saturday_t14_total", columnDefinition = "int(3) default 0")
	private int saturdayT14Total;
	@Column(name = "saturday_t14_remain", columnDefinition = "int(3) default 0")
	private int saturdayT14Remain;

	@Column(name = "saturday_t15_total", columnDefinition = "int(3) default 0")
	private int saturdayT15Total;
	@Column(name = "saturday_t15_remain", columnDefinition = "int(3) default 0")
	private int saturdayT15Remain;

	@Column(name = "saturday_t16_total", columnDefinition = "int(3) default 0")
	private int saturdayT16Total;
	@Column(name = "saturday_t16_remain", columnDefinition = "int(3) default 0")
	private int saturdayT16Remain;

	@Column(name = "saturday_t17_total", columnDefinition = "int(3) default 0")
	private int saturdayT17Total;
	@Column(name = "saturday_t17_remain", columnDefinition = "int(3) default 0")
	private int saturdayT17Remain;

	@Column(name = "saturday_t18_total", columnDefinition = "int(3) default 0")
	private int saturdayT18Total;
	@Column(name = "saturday_t18_remain", columnDefinition = "int(3) default 0")
	private int saturdayT18Remain;

	@Column(name = "saturday_t19_total", columnDefinition = "int(3) default 0")
	private int saturdayT19Total;
	@Column(name = "saturday_t19_remain", columnDefinition = "int(3) default 0")
	private int saturdayT19Remain;

	@Column(name = "saturday_t20_total", columnDefinition = "int(3) default 0")
	private int saturdayT20Total;
	@Column(name = "saturday_t20_remain", columnDefinition = "int(3) default 0")
	private int saturdayT20Remain;

	@Column(name = "saturday_t21_total", columnDefinition = "int(3) default 0")
	private int saturdayT21Total;
	@Column(name = "saturday_t21_remain", columnDefinition = "int(3) default 0")
	private int saturdayT21Remain;
	// 周日

	@Column(name = "sunday_t8_total", columnDefinition = "int(3) default 0")
	private int sundayT8Total;

	@Column(name = "sunday_t8_remain", columnDefinition = "int(3) default 0")
	private int sundayT8Remain;

	@Column(name = "sunday_t9_total", columnDefinition = "int(3) default 0")
	private int sundayT9Total;
	@Column(name = "sunday_t9_remain", columnDefinition = "int(3) default 0")
	private int sundayT9Remain;

	@Column(name = "sunday_t10_total", columnDefinition = "int(3) default 0")
	private int sundayT10Total;
	@Column(name = "sunday_t10_remain", columnDefinition = "int(3) default 0")
	private int sundayT10Remain;

	@Column(name = "sunday_t11_total", columnDefinition = "int(3) default 0")
	private int sundayT11Total;
	@Column(name = "sunday_t11_remain", columnDefinition = "int(3) default 0")
	private int sundayT11Remain;

	@Column(name = "sunday_t12_total", columnDefinition = "int(3) default 0")
	private int sundayT12Total;
	@Column(name = "sunday_t12_remain", columnDefinition = "int(3) default 0")
	private int sundayT12Remain;

	@Column(name = "sunday_t13_total", columnDefinition = "int(3) default 0")
	private int sundayT13Total;
	@Column(name = "sunday_t13_remain", columnDefinition = "int(3) default 0")
	private int sundayT13Remain;

	@Column(name = "sunday_t14_total", columnDefinition = "int(3) default 0")
	private int sundayT14Total;
	@Column(name = "sunday_t14_remain", columnDefinition = "int(3) default 0")
	private int sundayT14Remain;

	@Column(name = "sunday_t15_total", columnDefinition = "int(3) default 0")
	private int sundayT15Total;
	@Column(name = "sunday_t15_remain", columnDefinition = "int(3) default 0")
	private int sundayT15Remain;

	@Column(name = "sunday_t16_total", columnDefinition = "int(3) default 0")
	private int sundayT16Total;
	@Column(name = "sunday_t16_remain", columnDefinition = "int(3) default 0")
	private int sundayT16Remain;

	@Column(name = "sunday_t17_total", columnDefinition = "int(3) default 0")
	private int sundayT17Total;
	@Column(name = "sunday_t17_remain", columnDefinition = "int(3) default 0")
	private int sundayT17Remain;

	@Column(name = "sunday_t18_total", columnDefinition = "int(3) default 0")
	private int sundayT18Total;
	@Column(name = "sunday_t18_remain", columnDefinition = "int(3) default 0")
	private int sundayT18Remain;

	@Column(name = "sunday_t19_total", columnDefinition = "int(3) default 0")
	private int sundayT19Total;
	@Column(name = "sunday_t19_remain", columnDefinition = "int(3) default 0")
	private int sundayT19Remain;

	@Column(name = "sunday_t20_total", columnDefinition = "int(3) default 0")
	private int sundayT20Total;
	@Column(name = "sunday_t20_remain", columnDefinition = "int(3) default 0")
	private int sundayT20Remain;

	@Column(name = "sunday_t21_total", columnDefinition = "int(3) default 0")
	private int sundayT21Total;
	@Column(name = "sunday_t21_remain", columnDefinition = "int(3) default 0")
	private int sundayT21Remain;

	public long getWsid() {
		return wsid;
	}

	public void setWsid(long wsid) {
		this.wsid = wsid;
	}

	public int getMondayT8Total() {
		return mondayT8Total;
	}

	public void setMondayT8Total(int mondayT8Total) {
		this.mondayT8Total = mondayT8Total;
	}

	public int getMondayT8Remain() {
		return mondayT8Remain;
	}

	public void setMondayT8Remain(int mondayT8Remain) {
		this.mondayT8Remain = mondayT8Remain;
	}

	public int getMondayT9Total() {
		return mondayT9Total;
	}

	public void setMondayT9Total(int mondayT9Total) {
		this.mondayT9Total = mondayT9Total;
	}

	public int getMondayT9Remain() {
		return mondayT9Remain;
	}

	public void setMondayT9Remain(int mondayT9Remain) {
		this.mondayT9Remain = mondayT9Remain;
	}

	public int getMondayT10Total() {
		return mondayT10Total;
	}

	public void setMondayT10Total(int mondayT10Total) {
		this.mondayT10Total = mondayT10Total;
	}

	public int getMondayT10Remain() {
		return mondayT10Remain;
	}

	public void setMondayT10Remain(int mondayT10Remain) {
		this.mondayT10Remain = mondayT10Remain;
	}

	public int getMondayT11Total() {
		return mondayT11Total;
	}

	public void setMondayT11Total(int mondayT11Total) {
		this.mondayT11Total = mondayT11Total;
	}

	public int getMondayT11Remain() {
		return mondayT11Remain;
	}

	public void setMondayT11Remain(int mondayT11Remain) {
		this.mondayT11Remain = mondayT11Remain;
	}

	public int getMondayT12Total() {
		return mondayT12Total;
	}

	public void setMondayT12Total(int mondayT12Total) {
		this.mondayT12Total = mondayT12Total;
	}

	public int getMondayT12Remain() {
		return mondayT12Remain;
	}

	public void setMondayT12Remain(int mondayT12Remain) {
		this.mondayT12Remain = mondayT12Remain;
	}

	public int getMondayT13Total() {
		return mondayT13Total;
	}

	public void setMondayT13Total(int mondayT13Total) {
		this.mondayT13Total = mondayT13Total;
	}

	public int getMondayT13Remain() {
		return mondayT13Remain;
	}

	public void setMondayT13Remain(int mondayT13Remain) {
		this.mondayT13Remain = mondayT13Remain;
	}

	public int getMondayT14Total() {
		return mondayT14Total;
	}

	public void setMondayT14Total(int mondayT14Total) {
		this.mondayT14Total = mondayT14Total;
	}

	public int getMondayT14Remain() {
		return mondayT14Remain;
	}

	public void setMondayT14Remain(int mondayT14Remain) {
		this.mondayT14Remain = mondayT14Remain;
	}

	public int getMondayT15Total() {
		return mondayT15Total;
	}

	public void setMondayT15Total(int mondayT15Total) {
		this.mondayT15Total = mondayT15Total;
	}

	public int getMondayT15Remain() {
		return mondayT15Remain;
	}

	public void setMondayT15Remain(int mondayT15Remain) {
		this.mondayT15Remain = mondayT15Remain;
	}

	public int getMondayT16Total() {
		return mondayT16Total;
	}

	public void setMondayT16Total(int mondayT16Total) {
		this.mondayT16Total = mondayT16Total;
	}

	public int getMondayT16Remain() {
		return mondayT16Remain;
	}

	public void setMondayT16Remain(int mondayT16Remain) {
		this.mondayT16Remain = mondayT16Remain;
	}

	public int getMondayT17Total() {
		return mondayT17Total;
	}

	public void setMondayT17Total(int mondayT17Total) {
		this.mondayT17Total = mondayT17Total;
	}

	public int getMondayT17Remain() {
		return mondayT17Remain;
	}

	public void setMondayT17Remain(int mondayT17Remain) {
		this.mondayT17Remain = mondayT17Remain;
	}

	public int getMondayT19Total() {
		return mondayT19Total;
	}

	public void setMondayT19Total(int mondayT19Total) {
		this.mondayT19Total = mondayT19Total;
	}

	public int getMondayT19Remain() {
		return mondayT19Remain;
	}

	public void setMondayT19Remain(int mondayT19Remain) {
		this.mondayT19Remain = mondayT19Remain;
	}

	public int getMondayT20Total() {
		return mondayT20Total;
	}

	public void setMondayT20Total(int mondayT20Total) {
		this.mondayT20Total = mondayT20Total;
	}

	public int getMondayT20Remain() {
		return mondayT20Remain;
	}

	public void setMondayT20Remain(int mondayT20Remain) {
		this.mondayT20Remain = mondayT20Remain;
	}

	public int getMondayT21Total() {
		return mondayT21Total;
	}

	public void setMondayT21Total(int mondayT21Total) {
		this.mondayT21Total = mondayT21Total;
	}

	public int getMondayT21Remain() {
		return mondayT21Remain;
	}

	public void setMondayT21Remain(int mondayT21Remain) {
		this.mondayT21Remain = mondayT21Remain;
	}

	public int getThuesdayT8Total() {
		return thuesdayT8Total;
	}

	public void setThuesdayT8Total(int thuesdayT8Total) {
		this.thuesdayT8Total = thuesdayT8Total;
	}

	public int getThuesdayT8Remain() {
		return thuesdayT8Remain;
	}

	public void setThuesdayT8Remain(int thuesdayT8Remain) {
		this.thuesdayT8Remain = thuesdayT8Remain;
	}

	public int getThuesdayT9Total() {
		return thuesdayT9Total;
	}

	public void setThuesdayT9Total(int thuesdayT9Total) {
		this.thuesdayT9Total = thuesdayT9Total;
	}

	public int getThuesdayT9Remain() {
		return thuesdayT9Remain;
	}

	public void setThuesdayT9Remain(int thuesdayT9Remain) {
		this.thuesdayT9Remain = thuesdayT9Remain;
	}

	public int getThuesdayT10Total() {
		return thuesdayT10Total;
	}

	public void setThuesdayT10Total(int thuesdayT10Total) {
		this.thuesdayT10Total = thuesdayT10Total;
	}

	public int getThuesdayT10Remain() {
		return thuesdayT10Remain;
	}

	public void setThuesdayT10Remain(int thuesdayT10Remain) {
		this.thuesdayT10Remain = thuesdayT10Remain;
	}

	public int getThuesdayT11Total() {
		return thuesdayT11Total;
	}

	public void setThuesdayT11Total(int thuesdayT11Total) {
		this.thuesdayT11Total = thuesdayT11Total;
	}

	public int getThuesdayT11Remain() {
		return thuesdayT11Remain;
	}

	public void setThuesdayT11Remain(int thuesdayT11Remain) {
		this.thuesdayT11Remain = thuesdayT11Remain;
	}

	public int getThuesdayT12Total() {
		return thuesdayT12Total;
	}

	public void setThuesdayT12Total(int thuesdayT12Total) {
		this.thuesdayT12Total = thuesdayT12Total;
	}

	public int getThuesdayT12Remain() {
		return thuesdayT12Remain;
	}

	public void setThuesdayT12Remain(int thuesdayT12Remain) {
		this.thuesdayT12Remain = thuesdayT12Remain;
	}

	public int getThuesdayT13Total() {
		return thuesdayT13Total;
	}

	public void setThuesdayT13Total(int thuesdayT13Total) {
		this.thuesdayT13Total = thuesdayT13Total;
	}

	public int getThuesdayT13Remain() {
		return thuesdayT13Remain;
	}

	public void setThuesdayT13Remain(int thuesdayT13Remain) {
		this.thuesdayT13Remain = thuesdayT13Remain;
	}

	public int getThuesdayT14Total() {
		return thuesdayT14Total;
	}

	public void setThuesdayT14Total(int thuesdayT14Total) {
		this.thuesdayT14Total = thuesdayT14Total;
	}

	public int getThuesdayT14Remain() {
		return thuesdayT14Remain;
	}

	public void setThuesdayT14Remain(int thuesdayT14Remain) {
		this.thuesdayT14Remain = thuesdayT14Remain;
	}

	public int getThuesdayT15Total() {
		return thuesdayT15Total;
	}

	public void setThuesdayT15Total(int thuesdayT15Total) {
		this.thuesdayT15Total = thuesdayT15Total;
	}

	public int getThuesdayT15Remain() {
		return thuesdayT15Remain;
	}

	public void setThuesdayT15Remain(int thuesdayT15Remain) {
		this.thuesdayT15Remain = thuesdayT15Remain;
	}

	public int getThuesdayT16Total() {
		return thuesdayT16Total;
	}

	public void setThuesdayT16Total(int thuesdayT16Total) {
		this.thuesdayT16Total = thuesdayT16Total;
	}

	public int getThuesdayT16Remain() {
		return thuesdayT16Remain;
	}

	public void setThuesdayT16Remain(int thuesdayT16Remain) {
		this.thuesdayT16Remain = thuesdayT16Remain;
	}

	public int getThuesdayT17Total() {
		return thuesdayT17Total;
	}

	public void setThuesdayT17Total(int thuesdayT17Total) {
		this.thuesdayT17Total = thuesdayT17Total;
	}

	public int getThuesdayT17Remain() {
		return thuesdayT17Remain;
	}

	public void setThuesdayT17Remain(int thuesdayT17Remain) {
		this.thuesdayT17Remain = thuesdayT17Remain;
	}

	public int getThuesdayT19Total() {
		return thuesdayT19Total;
	}

	public void setThuesdayT19Total(int thuesdayT19Total) {
		this.thuesdayT19Total = thuesdayT19Total;
	}

	public int getThuesdayT19Remain() {
		return thuesdayT19Remain;
	}

	public void setThuesdayT19Remain(int thuesdayT19Remain) {
		this.thuesdayT19Remain = thuesdayT19Remain;
	}

	public int getThuesdayT20Total() {
		return thuesdayT20Total;
	}

	public void setThuesdayT20Total(int thuesdayT20Total) {
		this.thuesdayT20Total = thuesdayT20Total;
	}

	public int getThuesdayT20Remain() {
		return thuesdayT20Remain;
	}

	public void setThuesdayT20Remain(int thuesdayT20Remain) {
		this.thuesdayT20Remain = thuesdayT20Remain;
	}

	public int getThuesdayT21Total() {
		return thuesdayT21Total;
	}

	public void setThuesdayT21Total(int thuesdayT21Total) {
		this.thuesdayT21Total = thuesdayT21Total;
	}

	public int getThuesdayT21Remain() {
		return thuesdayT21Remain;
	}

	public void setThuesdayT21Remain(int thuesdayT21Remain) {
		this.thuesdayT21Remain = thuesdayT21Remain;
	}

	public int getWednesdayT8Total() {
		return wednesdayT8Total;
	}

	public void setWednesdayT8Total(int wednesdayT8Total) {
		this.wednesdayT8Total = wednesdayT8Total;
	}

	public int getWednesdayT8Remain() {
		return wednesdayT8Remain;
	}

	public void setWednesdayT8Remain(int wednesdayT8Remain) {
		this.wednesdayT8Remain = wednesdayT8Remain;
	}

	public int getWednesdayT9Total() {
		return wednesdayT9Total;
	}

	public void setWednesdayT9Total(int wednesdayT9Total) {
		this.wednesdayT9Total = wednesdayT9Total;
	}

	public int getWednesdayT9Remain() {
		return wednesdayT9Remain;
	}

	public void setWednesdayT9Remain(int wednesdayT9Remain) {
		this.wednesdayT9Remain = wednesdayT9Remain;
	}

	public int getWednesdayT10Total() {
		return wednesdayT10Total;
	}

	public void setWednesdayT10Total(int wednesdayT10Total) {
		this.wednesdayT10Total = wednesdayT10Total;
	}

	public int getWednesdayT10Remain() {
		return wednesdayT10Remain;
	}

	public void setWednesdayT10Remain(int wednesdayT10Remain) {
		this.wednesdayT10Remain = wednesdayT10Remain;
	}

	public int getWednesdayT11Total() {
		return wednesdayT11Total;
	}

	public void setWednesdayT11Total(int wednesdayT11Total) {
		this.wednesdayT11Total = wednesdayT11Total;
	}

	public int getWednesdayT11Remain() {
		return wednesdayT11Remain;
	}

	public void setWednesdayT11Remain(int wednesdayT11Remain) {
		this.wednesdayT11Remain = wednesdayT11Remain;
	}

	public int getWednesdayT12Total() {
		return wednesdayT12Total;
	}

	public void setWednesdayT12Total(int wednesdayT12Total) {
		this.wednesdayT12Total = wednesdayT12Total;
	}

	public int getWednesdayT12Remain() {
		return wednesdayT12Remain;
	}

	public void setWednesdayT12Remain(int wednesdayT12Remain) {
		this.wednesdayT12Remain = wednesdayT12Remain;
	}

	public int getWednesdayT13Total() {
		return wednesdayT13Total;
	}

	public void setWednesdayT13Total(int wednesdayT13Total) {
		this.wednesdayT13Total = wednesdayT13Total;
	}

	public int getWednesdayT13Remain() {
		return wednesdayT13Remain;
	}

	public void setWednesdayT13Remain(int wednesdayT13Remain) {
		this.wednesdayT13Remain = wednesdayT13Remain;
	}

	public int getWednesdayT14Total() {
		return wednesdayT14Total;
	}

	public void setWednesdayT14Total(int wednesdayT14Total) {
		this.wednesdayT14Total = wednesdayT14Total;
	}

	public int getWednesdayT14Remain() {
		return wednesdayT14Remain;
	}

	public void setWednesdayT14Remain(int wednesdayT14Remain) {
		this.wednesdayT14Remain = wednesdayT14Remain;
	}

	public int getWednesdayT15Total() {
		return wednesdayT15Total;
	}

	public void setWednesdayT15Total(int wednesdayT15Total) {
		this.wednesdayT15Total = wednesdayT15Total;
	}

	public int getWednesdayT15Remain() {
		return wednesdayT15Remain;
	}

	public void setWednesdayT15Remain(int wednesdayT15Remain) {
		this.wednesdayT15Remain = wednesdayT15Remain;
	}

	public int getWednesdayT16Total() {
		return wednesdayT16Total;
	}

	public void setWednesdayT16Total(int wednesdayT16Total) {
		this.wednesdayT16Total = wednesdayT16Total;
	}

	public int getWednesdayT16Remain() {
		return wednesdayT16Remain;
	}

	public void setWednesdayT16Remain(int wednesdayT16Remain) {
		this.wednesdayT16Remain = wednesdayT16Remain;
	}

	public int getWednesdayT17Total() {
		return wednesdayT17Total;
	}

	public void setWednesdayT17Total(int wednesdayT17Total) {
		this.wednesdayT17Total = wednesdayT17Total;
	}

	public int getWednesdayT17Remain() {
		return wednesdayT17Remain;
	}

	public void setWednesdayT17Remain(int wednesdayT17Remain) {
		this.wednesdayT17Remain = wednesdayT17Remain;
	}

	public int getWednesdayT19Total() {
		return wednesdayT19Total;
	}

	public void setWednesdayT19Total(int wednesdayT19Total) {
		this.wednesdayT19Total = wednesdayT19Total;
	}

	public int getWednesdayT19Remain() {
		return wednesdayT19Remain;
	}

	public void setWednesdayT19Remain(int wednesdayT19Remain) {
		this.wednesdayT19Remain = wednesdayT19Remain;
	}

	public int getWednesdayT20Total() {
		return wednesdayT20Total;
	}

	public void setWednesdayT20Total(int wednesdayT20Total) {
		this.wednesdayT20Total = wednesdayT20Total;
	}

	public int getWednesdayT20Remain() {
		return wednesdayT20Remain;
	}

	public void setWednesdayT20Remain(int wednesdayT20Remain) {
		this.wednesdayT20Remain = wednesdayT20Remain;
	}

	public int getWednesdayT21Total() {
		return wednesdayT21Total;
	}

	public void setWednesdayT21Total(int wednesdayT21Total) {
		this.wednesdayT21Total = wednesdayT21Total;
	}

	public int getWednesdayT21Remain() {
		return wednesdayT21Remain;
	}

	public void setWednesdayT21Remain(int wednesdayT21Remain) {
		this.wednesdayT21Remain = wednesdayT21Remain;
	}

	public int getThursdayT8Total() {
		return thursdayT8Total;
	}

	public void setThursdayT8Total(int thursdayT8Total) {
		this.thursdayT8Total = thursdayT8Total;
	}

	public int getThursdayT8Remain() {
		return thursdayT8Remain;
	}

	public void setThursdayT8Remain(int thursdayT8Remain) {
		this.thursdayT8Remain = thursdayT8Remain;
	}

	public int getThursdayT9Total() {
		return thursdayT9Total;
	}

	public void setThursdayT9Total(int thursdayT9Total) {
		this.thursdayT9Total = thursdayT9Total;
	}

	public int getThursdayT9Remain() {
		return thursdayT9Remain;
	}

	public void setThursdayT9Remain(int thursdayT9Remain) {
		this.thursdayT9Remain = thursdayT9Remain;
	}

	public int getThursdayT10Total() {
		return thursdayT10Total;
	}

	public void setThursdayT10Total(int thursdayT10Total) {
		this.thursdayT10Total = thursdayT10Total;
	}

	public int getThursdayT10Remain() {
		return thursdayT10Remain;
	}

	public void setThursdayT10Remain(int thursdayT10Remain) {
		this.thursdayT10Remain = thursdayT10Remain;
	}

	public int getThursdayT11Total() {
		return thursdayT11Total;
	}

	public void setThursdayT11Total(int thursdayT11Total) {
		this.thursdayT11Total = thursdayT11Total;
	}

	public int getThursdayT11Remain() {
		return thursdayT11Remain;
	}

	public void setThursdayT11Remain(int thursdayT11Remain) {
		this.thursdayT11Remain = thursdayT11Remain;
	}

	public int getThursdayT12Total() {
		return thursdayT12Total;
	}

	public void setThursdayT12Total(int thursdayT12Total) {
		this.thursdayT12Total = thursdayT12Total;
	}

	public int getThursdayT12Remain() {
		return thursdayT12Remain;
	}

	public void setThursdayT12Remain(int thursdayT12Remain) {
		this.thursdayT12Remain = thursdayT12Remain;
	}

	public int getThursdayT13Total() {
		return thursdayT13Total;
	}

	public void setThursdayT13Total(int thursdayT13Total) {
		this.thursdayT13Total = thursdayT13Total;
	}

	public int getThursdayT13Remain() {
		return thursdayT13Remain;
	}

	public void setThursdayT13Remain(int thursdayT13Remain) {
		this.thursdayT13Remain = thursdayT13Remain;
	}

	public int getThursdayT14Total() {
		return thursdayT14Total;
	}

	public void setThursdayT14Total(int thursdayT14Total) {
		this.thursdayT14Total = thursdayT14Total;
	}

	public int getThursdayT14Remain() {
		return thursdayT14Remain;
	}

	public void setThursdayT14Remain(int thursdayT14Remain) {
		this.thursdayT14Remain = thursdayT14Remain;
	}

	public int getThursdayT15Total() {
		return thursdayT15Total;
	}

	public void setThursdayT15Total(int thursdayT15Total) {
		this.thursdayT15Total = thursdayT15Total;
	}

	public int getThursdayT15Remain() {
		return thursdayT15Remain;
	}

	public void setThursdayT15Remain(int thursdayT15Remain) {
		this.thursdayT15Remain = thursdayT15Remain;
	}

	public int getThursdayT16Total() {
		return thursdayT16Total;
	}

	public void setThursdayT16Total(int thursdayT16Total) {
		this.thursdayT16Total = thursdayT16Total;
	}

	public int getThursdayT16Remain() {
		return thursdayT16Remain;
	}

	public void setThursdayT16Remain(int thursdayT16Remain) {
		this.thursdayT16Remain = thursdayT16Remain;
	}

	public int getThursdayT17Total() {
		return thursdayT17Total;
	}

	public void setThursdayT17Total(int thursdayT17Total) {
		this.thursdayT17Total = thursdayT17Total;
	}

	public int getThursdayT17Remain() {
		return thursdayT17Remain;
	}

	public void setThursdayT17Remain(int thursdayT17Remain) {
		this.thursdayT17Remain = thursdayT17Remain;
	}

	public int getThursdayT19Total() {
		return thursdayT19Total;
	}

	public void setThursdayT19Total(int thursdayT19Total) {
		this.thursdayT19Total = thursdayT19Total;
	}

	public int getThursdayT19Remain() {
		return thursdayT19Remain;
	}

	public void setThursdayT19Remain(int thursdayT19Remain) {
		this.thursdayT19Remain = thursdayT19Remain;
	}

	public int getThursdayT20Total() {
		return thursdayT20Total;
	}

	public void setThursdayT20Total(int thursdayT20Total) {
		this.thursdayT20Total = thursdayT20Total;
	}

	public int getThursdayT20Remain() {
		return thursdayT20Remain;
	}

	public void setThursdayT20Remain(int thursdayT20Remain) {
		this.thursdayT20Remain = thursdayT20Remain;
	}

	public int getThursdayT21Total() {
		return thursdayT21Total;
	}

	public void setThursdayT21Total(int thursdayT21Total) {
		this.thursdayT21Total = thursdayT21Total;
	}

	public int getThursdayT21Remain() {
		return thursdayT21Remain;
	}

	public void setThursdayT21Remain(int thursdayT21Remain) {
		this.thursdayT21Remain = thursdayT21Remain;
	}

	public int getFridayT8Total() {
		return fridayT8Total;
	}

	public void setFridayT8Total(int fridayT8Total) {
		this.fridayT8Total = fridayT8Total;
	}

	public int getFridayT8Remain() {
		return fridayT8Remain;
	}

	public void setFridayT8Remain(int fridayT8Remain) {
		this.fridayT8Remain = fridayT8Remain;
	}

	public int getFridayT9Total() {
		return fridayT9Total;
	}

	public void setFridayT9Total(int fridayT9Total) {
		this.fridayT9Total = fridayT9Total;
	}

	public int getFridayT9Remain() {
		return fridayT9Remain;
	}

	public void setFridayT9Remain(int fridayT9Remain) {
		this.fridayT9Remain = fridayT9Remain;
	}

	public int getFridayT10Total() {
		return fridayT10Total;
	}

	public void setFridayT10Total(int fridayT10Total) {
		this.fridayT10Total = fridayT10Total;
	}

	public int getFridayT10Remain() {
		return fridayT10Remain;
	}

	public void setFridayT10Remain(int fridayT10Remain) {
		this.fridayT10Remain = fridayT10Remain;
	}

	public int getFridayT11Total() {
		return fridayT11Total;
	}

	public void setFridayT11Total(int fridayT11Total) {
		this.fridayT11Total = fridayT11Total;
	}

	public int getFridayT11Remain() {
		return fridayT11Remain;
	}

	public void setFridayT11Remain(int fridayT11Remain) {
		this.fridayT11Remain = fridayT11Remain;
	}

	public int getFridayT12Total() {
		return fridayT12Total;
	}

	public void setFridayT12Total(int fridayT12Total) {
		this.fridayT12Total = fridayT12Total;
	}

	public int getFridayT12Remain() {
		return fridayT12Remain;
	}

	public void setFridayT12Remain(int fridayT12Remain) {
		this.fridayT12Remain = fridayT12Remain;
	}

	public int getFridayT13Total() {
		return fridayT13Total;
	}

	public void setFridayT13Total(int fridayT13Total) {
		this.fridayT13Total = fridayT13Total;
	}

	public int getFridayT13Remain() {
		return fridayT13Remain;
	}

	public void setFridayT13Remain(int fridayT13Remain) {
		this.fridayT13Remain = fridayT13Remain;
	}

	public int getFridayT14Total() {
		return fridayT14Total;
	}

	public void setFridayT14Total(int fridayT14Total) {
		this.fridayT14Total = fridayT14Total;
	}

	public int getFridayT14Remain() {
		return fridayT14Remain;
	}

	public void setFridayT14Remain(int fridayT14Remain) {
		this.fridayT14Remain = fridayT14Remain;
	}

	public int getFridayT15Total() {
		return fridayT15Total;
	}

	public void setFridayT15Total(int fridayT15Total) {
		this.fridayT15Total = fridayT15Total;
	}

	public int getFridayT15Remain() {
		return fridayT15Remain;
	}

	public void setFridayT15Remain(int fridayT15Remain) {
		this.fridayT15Remain = fridayT15Remain;
	}

	public int getFridayT16Total() {
		return fridayT16Total;
	}

	public void setFridayT16Total(int fridayT16Total) {
		this.fridayT16Total = fridayT16Total;
	}

	public int getFridayT16Remain() {
		return fridayT16Remain;
	}

	public void setFridayT16Remain(int fridayT16Remain) {
		this.fridayT16Remain = fridayT16Remain;
	}

	public int getFridayT17Total() {
		return fridayT17Total;
	}

	public void setFridayT17Total(int fridayT17Total) {
		this.fridayT17Total = fridayT17Total;
	}

	public int getFridayT17Remain() {
		return fridayT17Remain;
	}

	public void setFridayT17Remain(int fridayT17Remain) {
		this.fridayT17Remain = fridayT17Remain;
	}

	public int getFridayT19Total() {
		return fridayT19Total;
	}

	public void setFridayT19Total(int fridayT19Total) {
		this.fridayT19Total = fridayT19Total;
	}

	public int getFridayT19Remain() {
		return fridayT19Remain;
	}

	public void setFridayT19Remain(int fridayT19Remain) {
		this.fridayT19Remain = fridayT19Remain;
	}

	public int getFridayT20Total() {
		return fridayT20Total;
	}

	public void setFridayT20Total(int fridayT20Total) {
		this.fridayT20Total = fridayT20Total;
	}

	public int getFridayT20Remain() {
		return fridayT20Remain;
	}

	public void setFridayT20Remain(int fridayT20Remain) {
		this.fridayT20Remain = fridayT20Remain;
	}

	public int getFridayT21Total() {
		return fridayT21Total;
	}

	public void setFridayT21Total(int fridayT21Total) {
		this.fridayT21Total = fridayT21Total;
	}

	public int getFridayT21Remain() {
		return fridayT21Remain;
	}

	public void setFridayT21Remain(int fridayT21Remain) {
		this.fridayT21Remain = fridayT21Remain;
	}

	public int getSaturdayT8Total() {
		return saturdayT8Total;
	}

	public void setSaturdayT8Total(int saturdayT8Total) {
		this.saturdayT8Total = saturdayT8Total;
	}

	public int getSaturdayT8Remain() {
		return saturdayT8Remain;
	}

	public void setSaturdayT8Remain(int saturdayT8Remain) {
		this.saturdayT8Remain = saturdayT8Remain;
	}

	public int getSaturdayT9Total() {
		return saturdayT9Total;
	}

	public void setSaturdayT9Total(int saturdayT9Total) {
		this.saturdayT9Total = saturdayT9Total;
	}

	public int getSaturdayT9Remain() {
		return saturdayT9Remain;
	}

	public void setSaturdayT9Remain(int saturdayT9Remain) {
		this.saturdayT9Remain = saturdayT9Remain;
	}

	public int getSaturdayT10Total() {
		return saturdayT10Total;
	}

	public void setSaturdayT10Total(int saturdayT10Total) {
		this.saturdayT10Total = saturdayT10Total;
	}

	public int getSaturdayT10Remain() {
		return saturdayT10Remain;
	}

	public void setSaturdayT10Remain(int saturdayT10Remain) {
		this.saturdayT10Remain = saturdayT10Remain;
	}

	public int getSaturdayT11Total() {
		return saturdayT11Total;
	}

	public void setSaturdayT11Total(int saturdayT11Total) {
		this.saturdayT11Total = saturdayT11Total;
	}

	public int getSaturdayT11Remain() {
		return saturdayT11Remain;
	}

	public void setSaturdayT11Remain(int saturdayT11Remain) {
		this.saturdayT11Remain = saturdayT11Remain;
	}

	public int getSaturdayT12Total() {
		return saturdayT12Total;
	}

	public void setSaturdayT12Total(int saturdayT12Total) {
		this.saturdayT12Total = saturdayT12Total;
	}

	public int getSaturdayT12Remain() {
		return saturdayT12Remain;
	}

	public void setSaturdayT12Remain(int saturdayT12Remain) {
		this.saturdayT12Remain = saturdayT12Remain;
	}

	public int getSaturdayT13Total() {
		return saturdayT13Total;
	}

	public void setSaturdayT13Total(int saturdayT13Total) {
		this.saturdayT13Total = saturdayT13Total;
	}

	public int getSaturdayT13Remain() {
		return saturdayT13Remain;
	}

	public void setSaturdayT13Remain(int saturdayT13Remain) {
		this.saturdayT13Remain = saturdayT13Remain;
	}

	public int getSaturdayT14Total() {
		return saturdayT14Total;
	}

	public void setSaturdayT14Total(int saturdayT14Total) {
		this.saturdayT14Total = saturdayT14Total;
	}

	public int getSaturdayT14Remain() {
		return saturdayT14Remain;
	}

	public void setSaturdayT14Remain(int saturdayT14Remain) {
		this.saturdayT14Remain = saturdayT14Remain;
	}

	public int getSaturdayT15Total() {
		return saturdayT15Total;
	}

	public void setSaturdayT15Total(int saturdayT15Total) {
		this.saturdayT15Total = saturdayT15Total;
	}

	public int getSaturdayT15Remain() {
		return saturdayT15Remain;
	}

	public void setSaturdayT15Remain(int saturdayT15Remain) {
		this.saturdayT15Remain = saturdayT15Remain;
	}

	public int getSaturdayT16Total() {
		return saturdayT16Total;
	}

	public void setSaturdayT16Total(int saturdayT16Total) {
		this.saturdayT16Total = saturdayT16Total;
	}

	public int getSaturdayT16Remain() {
		return saturdayT16Remain;
	}

	public void setSaturdayT16Remain(int saturdayT16Remain) {
		this.saturdayT16Remain = saturdayT16Remain;
	}

	public int getSaturdayT17Total() {
		return saturdayT17Total;
	}

	public void setSaturdayT17Total(int saturdayT17Total) {
		this.saturdayT17Total = saturdayT17Total;
	}

	public int getSaturdayT17Remain() {
		return saturdayT17Remain;
	}

	public void setSaturdayT17Remain(int saturdayT17Remain) {
		this.saturdayT17Remain = saturdayT17Remain;
	}

	public int getSaturdayT19Total() {
		return saturdayT19Total;
	}

	public void setSaturdayT19Total(int saturdayT19Total) {
		this.saturdayT19Total = saturdayT19Total;
	}

	public int getSaturdayT19Remain() {
		return saturdayT19Remain;
	}

	public void setSaturdayT19Remain(int saturdayT19Remain) {
		this.saturdayT19Remain = saturdayT19Remain;
	}

	public int getSaturdayT20Total() {
		return saturdayT20Total;
	}

	public void setSaturdayT20Total(int saturdayT20Total) {
		this.saturdayT20Total = saturdayT20Total;
	}

	public int getSaturdayT20Remain() {
		return saturdayT20Remain;
	}

	public void setSaturdayT20Remain(int saturdayT20Remain) {
		this.saturdayT20Remain = saturdayT20Remain;
	}

	public int getSaturdayT21Total() {
		return saturdayT21Total;
	}

	public void setSaturdayT21Total(int saturdayT21Total) {
		this.saturdayT21Total = saturdayT21Total;
	}

	public int getSaturdayT21Remain() {
		return saturdayT21Remain;
	}

	public void setSaturdayT21Remain(int saturdayT21Remain) {
		this.saturdayT21Remain = saturdayT21Remain;
	}

	public int getSundayT8Total() {
		return sundayT8Total;
	}

	public void setSundayT8Total(int sundayT8Total) {
		this.sundayT8Total = sundayT8Total;
	}

	public int getSundayT8Remain() {
		return sundayT8Remain;
	}

	public void setSundayT8Remain(int sundayT8Remain) {
		this.sundayT8Remain = sundayT8Remain;
	}

	public int getSundayT9Total() {
		return sundayT9Total;
	}

	public void setSundayT9Total(int sundayT9Total) {
		this.sundayT9Total = sundayT9Total;
	}

	public int getSundayT9Remain() {
		return sundayT9Remain;
	}

	public void setSundayT9Remain(int sundayT9Remain) {
		this.sundayT9Remain = sundayT9Remain;
	}

	public int getSundayT10Total() {
		return sundayT10Total;
	}

	public void setSundayT10Total(int sundayT10Total) {
		this.sundayT10Total = sundayT10Total;
	}

	public int getSundayT10Remain() {
		return sundayT10Remain;
	}

	public void setSundayT10Remain(int sundayT10Remain) {
		this.sundayT10Remain = sundayT10Remain;
	}

	public int getSundayT11Total() {
		return sundayT11Total;
	}

	public void setSundayT11Total(int sundayT11Total) {
		this.sundayT11Total = sundayT11Total;
	}

	public int getSundayT11Remain() {
		return sundayT11Remain;
	}

	public void setSundayT11Remain(int sundayT11Remain) {
		this.sundayT11Remain = sundayT11Remain;
	}

	public int getSundayT12Total() {
		return sundayT12Total;
	}

	public void setSundayT12Total(int sundayT12Total) {
		this.sundayT12Total = sundayT12Total;
	}

	public int getSundayT12Remain() {
		return sundayT12Remain;
	}

	public void setSundayT12Remain(int sundayT12Remain) {
		this.sundayT12Remain = sundayT12Remain;
	}

	public int getSundayT13Total() {
		return sundayT13Total;
	}

	public void setSundayT13Total(int sundayT13Total) {
		this.sundayT13Total = sundayT13Total;
	}

	public int getSundayT13Remain() {
		return sundayT13Remain;
	}

	public void setSundayT13Remain(int sundayT13Remain) {
		this.sundayT13Remain = sundayT13Remain;
	}

	public int getSundayT14Total() {
		return sundayT14Total;
	}

	public void setSundayT14Total(int sundayT14Total) {
		this.sundayT14Total = sundayT14Total;
	}

	public int getSundayT14Remain() {
		return sundayT14Remain;
	}

	public void setSundayT14Remain(int sundayT14Remain) {
		this.sundayT14Remain = sundayT14Remain;
	}

	public int getSundayT15Total() {
		return sundayT15Total;
	}

	public void setSundayT15Total(int sundayT15Total) {
		this.sundayT15Total = sundayT15Total;
	}

	public int getSundayT15Remain() {
		return sundayT15Remain;
	}

	public void setSundayT15Remain(int sundayT15Remain) {
		this.sundayT15Remain = sundayT15Remain;
	}

	public int getSundayT16Total() {
		return sundayT16Total;
	}

	public void setSundayT16Total(int sundayT16Total) {
		this.sundayT16Total = sundayT16Total;
	}

	public int getSundayT16Remain() {
		return sundayT16Remain;
	}

	public void setSundayT16Remain(int sundayT16Remain) {
		this.sundayT16Remain = sundayT16Remain;
	}

	public int getSundayT17Total() {
		return sundayT17Total;
	}

	public void setSundayT17Total(int sundayT17Total) {
		this.sundayT17Total = sundayT17Total;
	}

	public int getSundayT17Remain() {
		return sundayT17Remain;
	}

	public void setSundayT17Remain(int sundayT17Remain) {
		this.sundayT17Remain = sundayT17Remain;
	}

	public int getSundayT19Total() {
		return sundayT19Total;
	}

	public void setSundayT19Total(int sundayT19Total) {
		this.sundayT19Total = sundayT19Total;
	}

	public int getSundayT19Remain() {
		return sundayT19Remain;
	}

	public void setSundayT19Remain(int sundayT19Remain) {
		this.sundayT19Remain = sundayT19Remain;
	}

	public int getSundayT20Total() {
		return sundayT20Total;
	}

	public void setSundayT20Total(int sundayT20Total) {
		this.sundayT20Total = sundayT20Total;
	}

	public int getSundayT20Remain() {
		return sundayT20Remain;
	}

	public void setSundayT20Remain(int sundayT20Remain) {
		this.sundayT20Remain = sundayT20Remain;
	}

	public int getSundayT21Total() {
		return sundayT21Total;
	}

	public void setSundayT21Total(int sundayT21Total) {
		this.sundayT21Total = sundayT21Total;
	}

	public int getSundayT21Remain() {
		return sundayT21Remain;
	}

	public void setSundayT21Remain(int sundayT21Remain) {
		this.sundayT21Remain = sundayT21Remain;
	}

	public int getMondayT18Total() {
		return mondayT18Total;
	}

	public void setMondayT18Total(int mondayT18Total) {
		this.mondayT18Total = mondayT18Total;
	}

	public int getMondayT18Remain() {
		return mondayT18Remain;
	}

	public void setMondayT18Remain(int mondayT18Remain) {
		this.mondayT18Remain = mondayT18Remain;
	}

	public int getThuesdayT18Total() {
		return thuesdayT18Total;
	}

	public void setThuesdayT18Total(int thuesdayT18Total) {
		this.thuesdayT18Total = thuesdayT18Total;
	}

	public int getThuesdayT18Remain() {
		return thuesdayT18Remain;
	}

	public void setThuesdayT18Remain(int thuesdayT18Remain) {
		this.thuesdayT18Remain = thuesdayT18Remain;
	}

	public int getWednesdayT18Total() {
		return wednesdayT18Total;
	}

	public void setWednesdayT18Total(int wednesdayT18Total) {
		this.wednesdayT18Total = wednesdayT18Total;
	}

	public int getWednesdayT18Remain() {
		return wednesdayT18Remain;
	}

	public void setWednesdayT18Remain(int wednesdayT18Remain) {
		this.wednesdayT18Remain = wednesdayT18Remain;
	}

	public int getThursdayT18Total() {
		return thursdayT18Total;
	}

	public void setThursdayT18Total(int thursdayT18Total) {
		this.thursdayT18Total = thursdayT18Total;
	}

	public int getThursdayT18Remain() {
		return thursdayT18Remain;
	}

	public void setThursdayT18Remain(int thursdayT18Remain) {
		this.thursdayT18Remain = thursdayT18Remain;
	}

	public int getFridayT18Total() {
		return fridayT18Total;
	}

	public void setFridayT18Total(int fridayT18Total) {
		this.fridayT18Total = fridayT18Total;
	}

	public int getFridayT18Remain() {
		return fridayT18Remain;
	}

	public void setFridayT18Remain(int fridayT18Remain) {
		this.fridayT18Remain = fridayT18Remain;
	}

	public int getSaturdayT18Total() {
		return saturdayT18Total;
	}

	public void setSaturdayT18Total(int saturdayT18Total) {
		this.saturdayT18Total = saturdayT18Total;
	}

	public int getSaturdayT18Remain() {
		return saturdayT18Remain;
	}

	public void setSaturdayT18Remain(int saturdayT18Remain) {
		this.saturdayT18Remain = saturdayT18Remain;
	}

	public int getSundayT18Total() {
		return sundayT18Total;
	}

	public void setSundayT18Total(int sundayT18Total) {
		this.sundayT18Total = sundayT18Total;
	}

	public int getSundayT18Remain() {
		return sundayT18Remain;
	}

	public void setSundayT18Remain(int sundayT18Remain) {
		this.sundayT18Remain = sundayT18Remain;
	}

	public void setRemain(int[] remain) {
		this.remain = remain;
	}

	// 把所有数据整合到一个数组
	public int[] getTotal() {
		if (total == null) {
			int[] temp = new int[TIMECOUNT];
			int index = 0;
			temp[index++] = getMondayT8Total();
			temp[index++] = getMondayT9Total();
			temp[index++] = getMondayT10Total();
			temp[index++] = getMondayT11Total();
			temp[index++] = getMondayT12Total();
			temp[index++] = getMondayT13Total();
			temp[index++] = getMondayT14Total();
			temp[index++] = getMondayT15Total();
			temp[index++] = getMondayT16Total();
			temp[index++] = getMondayT17Total();
			temp[index++] = getMondayT18Total();
			temp[index++] = getMondayT19Total();
			temp[index++] = getMondayT20Total();
			temp[index++] = getMondayT21Total();

			temp[index++] = getThuesdayT8Total();
			temp[index++] = getThuesdayT9Total();
			temp[index++] = getThuesdayT10Total();
			temp[index++] = getThuesdayT11Total();
			temp[index++] = getThuesdayT12Total();
			temp[index++] = getThuesdayT13Total();
			temp[index++] = getThuesdayT14Total();
			temp[index++] = getThuesdayT15Total();
			temp[index++] = getThuesdayT16Total();
			temp[index++] = getThuesdayT17Total();
			temp[index++] = getThuesdayT18Total();
			temp[index++] = getThuesdayT19Total();
			temp[index++] = getThuesdayT20Total();
			temp[index++] = getThuesdayT21Total();

			temp[index++] = getWednesdayT8Total();
			temp[index++] = getWednesdayT9Total();
			temp[index++] = getWednesdayT10Total();
			temp[index++] = getWednesdayT11Total();
			temp[index++] = getWednesdayT12Total();
			temp[index++] = getWednesdayT13Total();
			temp[index++] = getWednesdayT14Total();
			temp[index++] = getWednesdayT15Total();
			temp[index++] = getWednesdayT16Total();
			temp[index++] = getWednesdayT17Total();
			temp[index++] = getWednesdayT18Total();
			temp[index++] = getWednesdayT19Total();
			temp[index++] = getWednesdayT20Total();
			temp[index++] = getWednesdayT21Total();

			temp[index++] = getThursdayT8Total();
			temp[index++] = getThursdayT9Total();
			temp[index++] = getThursdayT10Total();
			temp[index++] = getThursdayT11Total();
			temp[index++] = getThursdayT12Total();
			temp[index++] = getThursdayT13Total();
			temp[index++] = getThursdayT14Total();
			temp[index++] = getThursdayT15Total();
			temp[index++] = getThursdayT16Total();
			temp[index++] = getThursdayT17Total();
			temp[index++] = getThursdayT18Total();
			temp[index++] = getThursdayT19Total();
			temp[index++] = getThursdayT20Total();
			temp[index++] = getThursdayT21Total();

			temp[index++] = getFridayT8Total();
			temp[index++] = getFridayT9Total();
			temp[index++] = getFridayT10Total();
			temp[index++] = getFridayT11Total();
			temp[index++] = getFridayT12Total();
			temp[index++] = getFridayT13Total();
			temp[index++] = getFridayT14Total();
			temp[index++] = getFridayT15Total();
			temp[index++] = getFridayT16Total();
			temp[index++] = getFridayT17Total();
			temp[index++] = getFridayT18Total();
			temp[index++] = getFridayT19Total();
			temp[index++] = getFridayT20Total();
			temp[index++] = getFridayT21Total();

			temp[index++] = getSaturdayT8Total();
			temp[index++] = getSaturdayT9Total();
			temp[index++] = getSaturdayT10Total();
			temp[index++] = getSaturdayT11Total();
			temp[index++] = getSaturdayT12Total();
			temp[index++] = getSaturdayT13Total();
			temp[index++] = getSaturdayT14Total();
			temp[index++] = getSaturdayT15Total();
			temp[index++] = getSaturdayT16Total();
			temp[index++] = getSaturdayT17Total();
			temp[index++] = getSaturdayT18Total();
			temp[index++] = getSaturdayT19Total();
			temp[index++] = getSaturdayT20Total();
			temp[index++] = getSaturdayT21Total();

			temp[index++] = getSundayT8Total();
			temp[index++] = getSundayT9Total();
			temp[index++] = getSundayT10Total();
			temp[index++] = getSundayT11Total();
			temp[index++] = getSundayT12Total();
			temp[index++] = getSundayT13Total();
			temp[index++] = getSundayT14Total();
			temp[index++] = getSundayT15Total();
			temp[index++] = getSundayT16Total();
			temp[index++] = getSundayT17Total();
			temp[index++] = getSundayT18Total();
			temp[index++] = getSundayT19Total();
			temp[index++] = getSundayT20Total();
			temp[index++] = getSundayT21Total();
			total = temp;
		}
		return total;
	}

	// 把所有数据整合到一个数组
	public int[] getRemain() {
		if (remain == null) {
			int[] temp = new int[TIMECOUNT];
			int index = 0;
			temp[index++] = getMondayT8Remain();
			temp[index++] = getMondayT9Remain();
			temp[index++] = getMondayT10Remain();
			temp[index++] = getMondayT11Remain();
			temp[index++] = getMondayT12Remain();
			temp[index++] = getMondayT13Remain();
			temp[index++] = getMondayT14Remain();
			temp[index++] = getMondayT15Remain();
			temp[index++] = getMondayT16Remain();
			temp[index++] = getMondayT17Remain();
			temp[index++] = getMondayT18Remain();
			temp[index++] = getMondayT19Remain();
			temp[index++] = getMondayT20Remain();
			temp[index++] = getMondayT21Remain();

			temp[index++] = getThuesdayT8Remain();
			temp[index++] = getThuesdayT9Remain();
			temp[index++] = getThuesdayT10Remain();
			temp[index++] = getThuesdayT11Remain();
			temp[index++] = getThuesdayT12Remain();
			temp[index++] = getThuesdayT13Remain();
			temp[index++] = getThuesdayT14Remain();
			temp[index++] = getThuesdayT15Remain();
			temp[index++] = getThuesdayT16Remain();
			temp[index++] = getThuesdayT17Remain();
			temp[index++] = getThuesdayT18Remain();
			temp[index++] = getThuesdayT19Remain();
			temp[index++] = getThuesdayT20Remain();
			temp[index++] = getThuesdayT21Remain();

			temp[index++] = getWednesdayT8Remain();
			temp[index++] = getWednesdayT9Remain();
			temp[index++] = getWednesdayT10Remain();
			temp[index++] = getWednesdayT11Remain();
			temp[index++] = getWednesdayT12Remain();
			temp[index++] = getWednesdayT13Remain();
			temp[index++] = getWednesdayT14Remain();
			temp[index++] = getWednesdayT15Remain();
			temp[index++] = getWednesdayT16Remain();
			temp[index++] = getWednesdayT17Remain();
			temp[index++] = getWednesdayT18Remain();
			temp[index++] = getWednesdayT19Remain();
			temp[index++] = getWednesdayT20Remain();
			temp[index++] = getWednesdayT21Remain();

			temp[index++] = getThursdayT8Remain();
			temp[index++] = getThursdayT9Remain();
			temp[index++] = getThursdayT10Remain();
			temp[index++] = getThursdayT11Remain();
			temp[index++] = getThursdayT12Remain();
			temp[index++] = getThursdayT13Remain();
			temp[index++] = getThursdayT14Remain();
			temp[index++] = getThursdayT15Remain();
			temp[index++] = getThursdayT16Remain();
			temp[index++] = getThursdayT17Remain();
			temp[index++] = getThursdayT18Remain();
			temp[index++] = getThursdayT19Remain();
			temp[index++] = getThursdayT20Remain();
			temp[index++] = getThursdayT21Remain();

			temp[index++] = getFridayT8Remain();
			temp[index++] = getFridayT9Remain();
			temp[index++] = getFridayT10Remain();
			temp[index++] = getFridayT11Remain();
			temp[index++] = getFridayT12Remain();
			temp[index++] = getFridayT13Remain();
			temp[index++] = getFridayT14Remain();
			temp[index++] = getFridayT15Remain();
			temp[index++] = getFridayT16Remain();
			temp[index++] = getFridayT17Remain();
			temp[index++] = getFridayT18Remain();
			temp[index++] = getFridayT19Remain();
			temp[index++] = getFridayT20Remain();
			temp[index++] = getFridayT21Remain();

			temp[index++] = getSaturdayT8Remain();
			temp[index++] = getSaturdayT9Remain();
			temp[index++] = getSaturdayT10Remain();
			temp[index++] = getSaturdayT11Remain();
			temp[index++] = getSaturdayT12Remain();
			temp[index++] = getSaturdayT13Remain();
			temp[index++] = getSaturdayT14Remain();
			temp[index++] = getSaturdayT15Remain();
			temp[index++] = getSaturdayT16Remain();
			temp[index++] = getSaturdayT17Remain();
			temp[index++] = getSaturdayT18Remain();
			temp[index++] = getSaturdayT19Remain();
			temp[index++] = getSaturdayT20Remain();
			temp[index++] = getSaturdayT21Remain();

			temp[index++] = getSundayT8Remain();
			temp[index++] = getSundayT9Remain();
			temp[index++] = getSundayT10Remain();
			temp[index++] = getSundayT11Remain();
			temp[index++] = getSundayT12Remain();
			temp[index++] = getSundayT13Remain();
			temp[index++] = getSundayT14Remain();
			temp[index++] = getSundayT15Remain();
			temp[index++] = getSundayT16Remain();
			temp[index++] = getSundayT17Remain();
			temp[index++] = getSundayT18Remain();
			temp[index++] = getSundayT19Remain();
			temp[index++] = getSundayT20Remain();
			temp[index++] = getSundayT21Remain();
			remain = temp;
		}
		return remain;
	}

}
