(ns macro.model.widget 
  (:require [schema.core :as s]))

(def skeleton 
  #{"alignment"
    "padding"
    "margin"
    "color"
    "decoration"
    "constraints"
    "width"
    "height"
    "text"
    "style"
    "fontSize"
    "fontWeight"
    "fontFamily"
    "textAlign"
    "onPressed"
    "onChanged"
    "keyboardType"
    "maxLines"
    "inputFormatters"
    "validator"
    "image"
    "icon"
    "size"
    "children"
    "itemBuilder"
    "scrollDirection"
    "itemCount"
    "animation"
    "curve"
    "onTap"
    "onLongPress"
    "gestureRecognizers"
    "condition"
    "enabled"
    "value"
    "initialValue"
    "controller"
    "shape"
    "border"
    "elevation"
    "key"
    "semanticLabel"
    "semanticContainer"})

(s/defschema WidgetType
  (s/Enum
   "scaffold"
   "Container"
   "Row"
   "scrollView"
   "Column"
   "Stack"
   "Positioned"
   "SizedBox"
   "Expanded"
   "Flexible"
   "ListView"
   "GridView"
   "Wrap"
   "Text"
   "RichText"
   "TextField"
   "TextFormField"
   "DropdownButton"
   "Checkbox"
   "Radio"
   "Slider"
   "ElevatedButton"
   "TextButton"
   "OutlinedButton"
   "FloatingActionButton"
   "Image"
   "ImageIcon"
   "Icon"
   "appBar"))

(s/defschema ScaffoldWidget
  {:type (s/eq :widget.type/scaffold)
   :appbar {:type (s/eq :widget.type/appBar)
                        }})

(s/defschema Widget
  (s/conditional #(= (:widget/type %) :widget.type/scaffold) ScaffoldWidget))



