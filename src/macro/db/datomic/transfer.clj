(ns macro.db.datomic.transfer 
  (:require [schema.core :as s]
            [macro.model.transfer :as model.tranfer]
            [datomic.api :as d]))

(s/defn add-transfer :- model.tranfer/Transfer
  [transfer :- model.tranfer/Transfer
   datomic]
  (d/transact 
   transfer
   datomic))

(s/defn chargeback-transfer :- model.tranfer/Transfer
  [transfer :- model.tranfer/Transfer
   datomic]
  (-> transfer
      (assoc :transfer/status :transfer.status/canceled)
   (d/transact datomic)))
