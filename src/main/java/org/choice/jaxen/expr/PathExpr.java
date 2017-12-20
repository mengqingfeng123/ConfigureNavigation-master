/*
 * $Header$
 * $Revision: 1300 $
 * $Date: 2007-05-02 07:27:46 -0700 (Wed, 02 May 2007) $
 *
 * ====================================================================
 *
 * Copyright 2000-2002 bob mcwhirter & James Strachan.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 * 
 *   * Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 * 
 *   * Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 * 
 *   * Neither the name of the Jaxen Project nor the names of its
 *     contributors may be used to endorse or promote products derived 
 *     from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER
 * OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * ====================================================================
 * This software consists of voluntary contributions made by many 
 * individuals on behalf of the Jaxen Project and was originally 
 * created by bob mcwhirter <bob@werken.com> and 
 * James Strachan <jstrachan@apache.org>.  For more information on the 
 * Jaxen Project, please see <http://www.jaxen.org/>.
 * 
 * $Id: PathExpr.java 1300 2007-05-02 14:27:46Z elharo $
 */



package org.choice.jaxen.expr;

/**
 * Represents an XPath path expression.
 * This is production 19 in the 
 * <a href="http://www.w3.org/TR/xpath#NT-PathExpr">XPath 1.0 specification</a>:
 * 
 * <pre>[19] PathExpr ::= LocationPath    
 *                | FilterExpr    
 *                | FilterExpr '/' RelativeLocationPath   
 *                | FilterExpr '//' RelativeLocationPath  </pre>
 * 
 */
public interface PathExpr extends Expr
{
    
    /**
     * Returns the filter expression that starts the path expression.
     * 
     * @return the filter expression that starts the path expression
     */
    Expr getFilterExpr();
    
    
    /**
     * Changes the expression's filter expression.
     * 
     * @param filterExpr the new filter expression
     */
    void setFilterExpr(Expr filterExpr);

    /**
     * Returns the location path part of this path expression.
     * 
     * @return the location path part of this expression
     */
    LocationPath getLocationPath();
    
}
