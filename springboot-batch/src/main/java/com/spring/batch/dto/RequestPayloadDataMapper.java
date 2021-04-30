package com.spring.batch.dto;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class RequestPayloadDataMapper implements ResultSetExtractor<List<RequestPayloadData>> {
	Map<Long, RequestPayloadData> datamap = new HashMap<Long, RequestPayloadData>();
	//	public RequestPayloadData mapRow(ResultSet rs, int rowNum) throws SQLException {
	//		
	////		do {
	////			if(rowNum <= 0){
	////				return null;
	////			}
	//			Long id = rs.getLong(1);
	//			RequestPayloadData data = datamap.get(id);
	//			if (data == null) {
	//				data = new RequestPayloadData(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4),
	//						new Date(rs.getTimestamp(5).getTime()), new Date(rs.getTimestamp(6).getTime()), rs.getLong(7),
	//						rs.getLong(8), rs.getLong(9), rs.getLong(10), rs.getString(11), rs.getString(12),
	//						rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17),
	//						rs.getString(18), rs.getString(19), rs.getLong(20), rs.getLong(21),
	//						new Date(rs.getTimestamp(22).getTime()), new Date(rs.getTimestamp(23).getTime()),
	//						rs.getLong(24));
	//				datamap.put(id, data);
	//			}
	//			if (Optional.ofNullable(rs.getString("OPPTY_ID")).isPresent()) {
	//				List<AdditionalData> additionalList = data.prepareAdditionalData();
	//				if (additionalList == null) {
	//					additionalList = new ArrayList<>();
	//					data.setAdditionalData(additionalList);
	//				}
	//				System.out.println(rs.getString("SGMNT_CD_LVL2"));
	//				AdditionalData addData = new AdditionalData(rs.getLong("OPPTY_ADDL_SEQ_ID"), rs.getLong("OPPTY_ID"),
	//						rs.getString("OPPTY_SRC_CD"), rs.getString("PGM_CD"), rs.getString("SUB_PGM_CD"),
	//						rs.getString("SGMNT_CD_LVL1"), rs.getString("SGMNT_CD_LVL2"), rs.getString("SGMNT_CD_LVL3"),
	//						rs.getString("SGMNT_CD_LVL4"), rs.getString("SGMNT_CD_LVL5"), rs.getString("SGMNT_CD_LVL6"),
	//						rs.getLong("SGMNT_SEQ_NBR"), rs.getString("ATRB_NM1"), rs.getString("ATRB_VAL1"),
	//						rs.getString("ATRB_NM2"), rs.getString("ATRB_VAL2"), rs.getString("ATRB_NM3"),
	//						rs.getString("ATRB_VAL3"), rs.getString("ATRB_NM4"), rs.getString("ATRB_VAL4"),
	//						rs.getString("ATRB_NM5"), rs.getString("ATRB_VAL5"), rs.getString("ATRB_NM6"),
	//						rs.getString("ATRB_VAL6"), rs.getString("ATRB_NM7"), rs.getString("ATRB_VAL7"),
	//						rs.getString("ATRB_NM8"), rs.getString("ATRB_VAL8"), rs.getString("ATRB_NM9"),
	//						rs.getString("ATRB_VAL9"), rs.getString("ATRB_NM10"), rs.getString("ATRB_VAL10"),
	//						rs.getLong("WKFLW_EXECN_ID"), new Date(rs.getTimestamp("WKFLW_EXECN_DT").getTime()),
	//						new Date(rs.getTimestamp("ODATE").getTime()), rs.getLong("SRC_WKFLW_EXECN_ID"));
	//				additionalList.add(addData);
	//			}
	//			return data;
	//		
	////		}while(rs.next());
	//		
	//	}
	@Override
	public List<RequestPayloadData> extractData(ResultSet rs) throws SQLException, DataAccessException {
		while (rs.next()) {
			Long id = rs.getLong(1);
			RequestPayloadData data = datamap.get(id);
			if (data == null) {
				data = new RequestPayloadData(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4),
						new Date(rs.getTimestamp(5).getTime()), new Date(rs.getTimestamp(6).getTime()), rs.getLong(7),
						rs.getLong(8), rs.getLong(9), rs.getLong(10), rs.getString(11), rs.getString(12),
						rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17),
						rs.getString(18), rs.getString(19), rs.getLong(20), rs.getLong(21),
						new Date(rs.getTimestamp(22).getTime()), new Date(rs.getTimestamp(23).getTime()),
						rs.getLong(24));
				datamap.put(id, data);
			}
			if (Optional.ofNullable(rs.getString("OPPTY_ID")).isPresent()) {
				List<AdditionalData> additionalList = data.prepareAdditionalData();
				if (additionalList == null) {
					additionalList = new ArrayList<>();
					data.setAdditionalData(additionalList);
				}
				System.out.println(rs.getString("SGMNT_CD_LVL2"));
				AdditionalData addData = new AdditionalData(rs.getLong("OPPTY_ADDL_SEQ_ID"), rs.getLong("OPPTY_ID"),
						rs.getString("OPPTY_SRC_CD"), rs.getString("PGM_CD"), rs.getString("SUB_PGM_CD"),
						rs.getString("SGMNT_CD_LVL1"), rs.getString("SGMNT_CD_LVL2"), rs.getString("SGMNT_CD_LVL3"),
						rs.getString("SGMNT_CD_LVL4"), rs.getString("SGMNT_CD_LVL5"), rs.getString("SGMNT_CD_LVL6"),
						rs.getLong("SGMNT_SEQ_NBR"), rs.getString("ATRB_NM1"), rs.getString("ATRB_VAL1"),
						rs.getString("ATRB_NM2"), rs.getString("ATRB_VAL2"), rs.getString("ATRB_NM3"),
						rs.getString("ATRB_VAL3"), rs.getString("ATRB_NM4"), rs.getString("ATRB_VAL4"),
						rs.getString("ATRB_NM5"), rs.getString("ATRB_VAL5"), rs.getString("ATRB_NM6"),
						rs.getString("ATRB_VAL6"), rs.getString("ATRB_NM7"), rs.getString("ATRB_VAL7"),
						rs.getString("ATRB_NM8"), rs.getString("ATRB_VAL8"), rs.getString("ATRB_NM9"),
						rs.getString("ATRB_VAL9"), rs.getString("ATRB_NM10"), rs.getString("ATRB_VAL10"),
						rs.getLong("WKFLW_EXECN_ID"), new Date(rs.getTimestamp("WKFLW_EXECN_DT").getTime()),
						new Date(rs.getTimestamp("ODATE").getTime()), rs.getLong("SRC_WKFLW_EXECN_ID"));
				additionalList.add(addData);
			}
		}
		return null;
	}
};