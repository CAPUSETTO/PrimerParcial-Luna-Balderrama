public class Turno {

    private String paciente;
    private Integer hora;
    private boolean confirmado;

    public  Turno(){}

    public Turno (String paciente,Integer hora,boolean confirmado){
        this.paciente = paciente;
        if (hora >= 8 && hora <= 18) {
            this.hora = hora;
        } else {
            System.out.println("Error, rango horario equivocado");
            this.hora = 8;
        }
        this.confirmado = confirmado;
    }

    public String getPaciente(){
        return paciente;
    }
    public Integer getHora(){
        return hora;
    }
    public boolean getConfirmado(){
        return confirmado;
    }

    public void setPaciente(String paciente){
        this.paciente = paciente;
    }
    public void setHora(Integer hora){
        this.hora = hora;
    }
    public  void setConfirmado(boolean confirmado){
        this.confirmado = confirmado;
    }

    public void confirmar(boolean confirmacion){
        if (!confirmacion) {
            this.confirmado = true;
        }else {
            System.out.println("Ya esta confirmado!");
        }
    }

    public void cancelar(boolean confirmacion){
        if (confirmacion) {
            this.confirmado = false;
        }else {
            System.out.println("Ya esta cancelada!");
        }
    }

    public void reprogramar(Integer nuevaHora){
        if (!this.confirmado) {
            if (nuevaHora >= 8 && nuevaHora <= 18) {
                this.hora = nuevaHora;
                this.confirmado = true;
            } else {
                System.out.println("Error, rango horario equivocado");
                this.hora = 8;
            }
        }else {
            System.out.println("No se pudo reprogramar!");
        }
    }

    public void ObtenerDescripcion (){
        System.out.println("Paciente:  " + paciente);
        System.out.println("Hora:  " + hora);
        System.out.println("Confirmado:  " + confirmado);
    }
}

