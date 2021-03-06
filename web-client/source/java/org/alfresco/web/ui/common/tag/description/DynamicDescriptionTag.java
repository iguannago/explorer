/*
 * Copyright (C) 2005-2010 Alfresco Software Limited.
 *
 * This file is part of Alfresco
 *
 * Alfresco is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Alfresco is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Alfresco. If not, see <http://www.gnu.org/licenses/>.
 */
package org.alfresco.web.ui.common.tag.description;

import javax.faces.component.UIComponent;

import org.springframework.extensions.webscripts.ui.common.tag.BaseComponentTag;

/**
 * Tag class to allow the dynamic description component to be used on a JSP page
 * 
 * @author gavinc
 */
public class DynamicDescriptionTag extends BaseComponentTag
{
   private String selected;
   private String functionName;
   
   /**
    * @see javax.faces.webapp.UIComponentTag#getComponentType()
    */
   public String getComponentType()
   {
      return "org.alfresco.faces.DynamicDescription";
   }

   /**
    * @see javax.faces.webapp.UIComponentTag#getRendererType()
    */
   public String getRendererType()
   {
      return null;
   }

   /**
    * @see javax.faces.webapp.UIComponentTag#setProperties(javax.faces.component.UIComponent)
    */
   protected void setProperties(UIComponent component)
   {
      super.setProperties(component);
      
      setStringProperty(component, "selected", this.selected);
      setStringStaticProperty(component, "functionName", this.functionName);
   }

   /**
    * @param selected Sets the selected description id
    */
   public void setSelected(String selected)
   {
      this.selected = selected;
   }
   
   /**
    * @param functionName Sets the JavaScript function name
    */
   public void setFunctionName(String functionName)
   {
      this.functionName = functionName;
   }
   
   /**
    * @see javax.servlet.jsp.tagext.Tag#release()
    */
   public void release()
   {
      super.release();
      
      this.selected = null;
      this.functionName = null;
   }
}
