(ns macro.model.wallet
  (:require [macro.model.transfer :refer [Transfer]]
            [schema.core :as s]))

(s/defschema Wallet
  {:wallet/id              {:schema s/Uuid :required true}
   :wallet/amount  {:schema s/Int :required true}
   :wallet/transfer {:schema #{Transfer}}})
