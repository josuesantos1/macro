(ns macro.model.account
  (:require [macro.model.user :refer [User]]
            [macro.model.wallet :refer [Wallet]]
            [schema.core :as s]))

(s/defschema Account
  {:account/id          {:schema s/Uuid :required true}
   :account/owner {:schema User :required true}
   :account/wallet {:schema Wallet :required true}})
