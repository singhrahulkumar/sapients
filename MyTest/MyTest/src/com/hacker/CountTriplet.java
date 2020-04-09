package com.hacker;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTriplet {

	public static void main(String[] args) {
		List<Long> arr = Arrays.asList(1L, 5L, 5L, 25L, 125L);
		long r = 5;
		check(arr, r);
	}

	private static void check(List<Long> arr, long commonRatio) {
		
		 long cnt = 0;
	        Map<Long, Long> map = new HashMap<>();
	        Map<Long, Long> rMap = new HashMap<>();
	        for (long n : arr) {
	            if (n % commonRatio == 0) {
	                long pre = n / commonRatio;// here was the mistake 'enter code here'
	                Long cnt2 = rMap.get(pre);
	                if (cnt2 != null)
	                    cnt += cnt2;

	                Long cnt1 = map.get(pre);
	                if (cnt1 != null)
	                    rMap.put(n, rMap.getOrDefault(n, 0L) + cnt1);
	            }
	            map.put(n, map.getOrDefault(n, 0L) + 1);
	        }
	        System.out.println( cnt);
		
/*		
		Long[] arrl = (Long[]) arr.toArray();
		int tripletCount = 0;
		for (int i = 0; i < arrl.length; i++) {

			Long a = arrl[i];
			Long nextValue = a * r;
			int count = 1;
			for (int j = i + 1; j < arrl.length; j++) {

				if (arrl[j] == nextValue) {
					count++;
					nextValue = arrl[j] * r;
				}
				if (count == 3) {
					tripletCount++;
					break;
				}

			}

		}
		
		System.out.println(tripletCount);*/
	}

}
