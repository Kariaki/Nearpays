package com.nearpays.nearpaysnfcsdk.handler.iso7816emv;


import com.nearpays.nearpaysnfcsdk.handler.enums.TagTypeEnum;
import com.nearpays.nearpaysnfcsdk.handler.enums.TagValueTypeEnum;

public interface ITag {

	enum Class {
		UNIVERSAL, APPLICATION, CONTEXT_SPECIFIC, PRIVATE
	}

	boolean isConstructed();

	byte[] getTagBytes();

	String getName();

	String getDescription();

	TagTypeEnum getType();

	TagValueTypeEnum getTagValueType();

	Class getTagClass();

	int getNumTagBytes();

}
