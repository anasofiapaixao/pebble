/*******************************************************************************
 * This file is part of Pebble.
 * 
 * Original work Copyright (c) 2009-2013 by the Twig Team
 * Modified work Copyright (c) 2013 by Mitchell Bösecke
 * 
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 ******************************************************************************/
package com.mitchellbosecke.pebble.node;

public abstract class NodeExpression extends AbstractNode {
	
	public NodeExpression(){
		super();
	}
	
	public NodeExpression(int lineNumber){
		super(lineNumber);
	}
	

}