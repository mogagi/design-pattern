
package com.mblinn.oo.strategy;

import com.mblin.oo.strategy.Person;
import com.mblin.oo.strategy.PersonValidator;

public class DummyValidator implements PersonValidator {

	@Override
	public boolean validate(Person person) {
		return true;
	}

}
