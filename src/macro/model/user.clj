(ns macro.model.user
  (:require [schema.core :as s]))

(s/defschema User
  {:user/id {:schema s/Uuid :required true}
   :user/name {:schema s/Str :required true}
   :user/email {:schema s/Str :required true}})
