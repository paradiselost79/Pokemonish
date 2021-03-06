/***************************************************************************

    Copyright (C) 2003-2005 Sam Stainsby. All rights reserved.

    This file is part of the JChassis Project.

    JChassis is free software; you can redistribute it and/or
    modify it under the terms of version 2.1 of the GNU Lesser
    General Public License as published by the Free Software Foundation.

    JChassis is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
    Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public
    License along with this library; if not, write to:

        Free Software Foundation, Inc.,
        59 Temple Place, Suite 330, Boston, MA  02111-1307 USA

    At the time of writing, the license can also be found on the
    world-wide web at:

        http://www.fsf.org/licenses/lgpl.txt

    JChassis project management can be contacted via email sent to
    sjstainsby@yahoo.com.au.

***************************************************************************/

package org.jchassis.termctl;


/**
 * An interface to a terminal that allows the user to set the colour
 * of characters subsequenly output to the screen.
 * It is intended that this will be implemented by terminal controllers
 * that support character colour attributes.
 *
 * <P><FONT SIZE=-1 COLOR="GRAY">
 * Copyright &copy; 2003-2005 Sam Stainsby.<BR>
 * Verbatim copying and distribution of this entire generated javadoc
 * document is permitted in any medium, provided this notice is preserved.
 * </FONT>
 */
public interface ColoredCharacterTerminal {

    /**
     * Sets the character foreground colour.
     *
     * @param color the foreground colour to set
     */
    void setForegroundColor(CharacterColor color) throws TerminalIoException;

    /**
     * Sets the character background colour.
     *
     * @param color the background colour to set
     */
    void setBackgroundColor(CharacterColor color) throws TerminalIoException;

    /**
     * Clears all styles back to their default (white text on black)
     */
    void clearCharacterColors() throws TerminalIoException;
}
