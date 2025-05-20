package Boletin11.Ejer2;

public class Data {
    int dia;
    int mes;
    int año;

    public Data(int dia, int año, int mes) {
        this.dia = dia;
        this.año = año;
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        try{
            if (dia == 28 || mes == 2){
                System.out.println("bisiesto");
                this.dia = dia;
            }else if (dia == 28 || mes != 2){
                if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                    System.out.println("Tiene 31 dias este mes");
                    this.dia = dia;
                }else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
                    System.out.println("Tiene 30 dias");
                    this.dia = dia;
                }
            }
            if(dia > 31){
                throw new Exception("Dia erroneo");
            }else{
                System.out.println("Dia correcto");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        try{
            if (año > 2999){
                throw new Exception("Ano erroneo");
            } else if (año < 1000) {
                throw new Exception("Ano erroneo");
            } else{
                System.out.println("Ano correcto");
                this.año = año;
            }
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }

    }

    public int getMes() {
        try{
            if(mes <= 12){
                System.out.println("Mes introducido correcto");
                this.mes = mes;
            }else{
                throw new Exception("Mes incorrecto");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    public String aCadea(){
        return "La fecha es: " + getDia() + getMes() + getAño();
    }
}
