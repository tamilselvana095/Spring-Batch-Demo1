package com.partioning;

import java.util.Map;

import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;

public class columnRangePartitioner implements Partitioner {

	@Override
	public Map<String, ExecutionContext> partition(int gridSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
