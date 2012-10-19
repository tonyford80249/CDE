
package com.cdoe.services;

import com.cdoe.biz.model.StateEqual;
import com.cdoe.biz.model.StateEqualbacked;
import com.cdoe.ui.form.StateEqualForm;
import java.util.List;

public interface IDisplayAdjustmentManager extends IBaseManager {

	void saveOrUpdate(StateEqualForm stateEqualForm);
	
	StateEqualForm setupForm();
	
	StateEqualForm setupForm(long id);
        
        public abstract List<StateEqual> getStateEqualInfo(final String districtNos, final String fiscalYear);

}
