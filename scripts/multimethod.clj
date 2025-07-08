(defmulti notificar :tipo)

(defmethod notificar :email [{:keys [destinatario assunto mensagem]}]
 (println "Enviando email para" destinatario)
  (println "Assunto:" assunto)
  (println "Mensagem:" mensagem))

(notificar {:tipo :email
            :destinatario "usuario@teste.com"
            :assunto "Promoção"
            :mensagem "Aproveite nossos descontos!"})
