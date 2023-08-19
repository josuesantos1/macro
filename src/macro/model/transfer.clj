(ns macro.model.transfer
  (:require [schema.core :as s]))

(s/defschema TransferStatus
  (s/enum :transfer.status/canceled
          :transfer.status/realized
          :transfer.status/error))

(s/defschema TransferType
  (s/enum :transfer.type/debit
          :transfer.type/credit))

(s/defschema Transfer
  {:transfer/id             {:schema s/Uuid :required true}
   :transfer/status    {:schema TransferStatus :required true}
   :transfer/type        {:schema TransferType :required true}
   :transfer/amount {:schema s/Int :required true}})
