/**
 * 
 */
package com.logicsimulator.evl.module.fsm;

import com.logicsimulator.evl.token.EvlToken;

/**
 * @author carlos
 *
 */
public class EvlModuleFSMModuleState extends EvlModuleFSMState {

	/**
	 * @param fsm
	 */
	public EvlModuleFSMModuleState(EvlModuleFSM fsm) {
		super(fsm);
	}

	/* (non-Javadoc)
	 * @see com.logicsimulator.evl.module.fsm.EvlModuleFSMState#consume(com.logicsimulator.evl.token.EvlToken)
	 */
	@Override
	public void consume(EvlToken token) {
		if (token.getType() == EvlToken.TokenType.NAME) {
			createNewModule(token.getName());
			changeState("type");
		} else {
			throw new RuntimeException();
		}
	}

}