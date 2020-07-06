package com.devinforest.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.devinforest.vo.Report;

@Mapper
public interface ReportMapper {
	List<Report> selectReportList(Map<String, Object> inputMap);
	int ReportTotalCount(Map<String, Object> totalCountMap);
}