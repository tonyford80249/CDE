
package com.cdoe.services;

import com.cdoe.biz.model.CommentInfo;
import com.cdoe.ui.form.CommentInfoForm;

public interface ICommentsManager extends IBaseManager {

	void saveOrUpdate(CommentInfoForm commentInfoForm);
	
	CommentInfoForm setupForm();
	
	CommentInfoForm setupForm(long id);

}
