(defmulti notificar :tipo)

(defmethod notificar :email [{:keys [destinatario assunto mensagem]}]
 (println "Enviando email para" destinatario)
  (println "Assunto:" assunto)
  (println "Mensagem:" mensagem))

(defmethod notificar :sms [{:keys [numero mensagem]}]
  (println "Enviando SMS para" numero)
  (println "Mensagem:" mensagem))

(notificar {:tipo :email
            :destinatario "usuario@teste.com"
            :assunto "Promoção"
            :mensagem "Aproveite nossos descontos!"})

(notificar {:tipo :sms
            :numero "+5511987654321"
            :mensagem "Seu código de verificação: 123456"})
