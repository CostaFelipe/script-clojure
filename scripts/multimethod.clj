(defmulti notificar :tipo)

(defmethod notificar :email [{:keys [destinatario assunto mensagem]}]
 (println "Enviando email para" destinatario)
  (println "Assunto:" assunto)
  (println "Mensagem:" mensagem))

(defmethod notificar :sms [{:keys [numero mensagem]}]
  (println "Enviando SMS para" numero)
  (println "Mensagem:" mensagem))

(notificar {:tipo :emails
            :destinatario "usuario@teste.com"
            :assunto "Promoção"
            :mensagem "Aproveite nossos descontos!"})

(notificar {:tipo :sms
            :numero "+5511987654321"
            :mensagem "Seu código de verificação: 123456"})

(defmulti area (fn [shape & _] shape))

(defmethod area :triangle [_ base height]
  (/ (* base height) 2))

(defmethod area :square [_ side]
  (* side side))

(defmethod area :rectangle [_ lenght width]
  (* lenght width))

(defmethod area :circle [_ radius]
 (* radius radius Math/PI))

(area :square 3)

(area :triangle 3 4)

(area :rectangle 4 6)

(area :circle 5)
