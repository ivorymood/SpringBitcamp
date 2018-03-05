package com.bitcamp.web.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.service.LottoService;
@Service
public class LottoServiceImpl implements LottoService{
	private static final Logger logger = LoggerFactory.getLogger(LottoServiceImpl.class);
	@Autowired LottoDTO lotto;
	@Override
	public LottoDTO findLottoCount(LottoDTO param) {
		int count = Integer.parseInt(param.getMoney())/1000;
		if(count>100) {
			count = 100;
		}
		lotto.setCount(count+"");
		return lotto;
	}

	@Override
	public LottoDTO createLotto() {
		lotto = new LottoDTO();
		// TODO Auto-generated method stub
		int[] arr = new int[6];
		String tmp="";
		for(int i=0; i<6; i++) {
			arr[i] = ((int)(Math.random()*45)+1);
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
			}
		}
		Arrays.sort(arr);
		for(int i=0; i<6; i++) {
			tmp += arr[i]+"/ ";
		}
		lotto.setLottoNumber(tmp);
		return lotto;
	}

	@Override
	public List<LottoDTO> createLottos(LottoDTO param) {
		List<LottoDTO> list = new ArrayList<>(); 
		
		for(int i=0; i<Integer.parseInt(findLottoCount(param).getCount());i++) {
			list.add(createLotto());
		}
		return list;
	}

}
