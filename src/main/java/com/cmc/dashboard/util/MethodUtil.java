package com.cmc.dashboard.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.cmc.dashboard.dto.LoginParameterObject;

public class MethodUtil {
	/**
	 * function to paging result list, use on Service
	 * 
	 * @param pageNumber
	 *            Number of current Page.
	 * @param pageSize
	 *            Number record per Page.
	 * @param sortType
	 *            Type sort data,default = ASC.
	 * @param sortField
	 *            field sort.
	 * @return a Page Request.
	 */
	public PageRequest Pagination(int pageNumber, int pageSize, String sortType, String sortField) {
		return (sortType == "DESC") ? new PageRequest(pageNumber - 1, pageSize, Sort.Direction.DESC, sortField)
				: new PageRequest(pageNumber - 1, pageSize, Sort.Direction.DESC, sortField);
	}
	
	public static boolean isNull(Object object) {
		return (object == null) ? true : false;
	}

	public static String sha1(String input) {
		if (input == null || input.equalsIgnoreCase("")) {
			return input;
		}
		try {
			MessageDigest mDigest;
			mDigest = MessageDigest.getInstance("SHA1");
			byte[] result = mDigest.digest(input.getBytes());
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < result.length; i++) {
				sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
			}
			return sb.toString();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static boolean validateLoginParams(String data, String regexter) {
		boolean isInvalid = (data==null || regexter == null || "".equals(data))?false:data.matches(regexter);
		return isInvalid;
	}
	
	public static LoginParameterObject getLoginParamsFromString(String passedParams) {
		if (passedParams == null || "".equals(passedParams)) {
			return null;
		}
		
		try {
			
			JSONObject object = new JSONObject(passedParams);
			String username = object.getString("username");
			String password = object.getString("password");
			return new LoginParameterObject(username, password);
			
		} catch (JSONException e) {
			e.printStackTrace();
			return null;
		}
	}
}
