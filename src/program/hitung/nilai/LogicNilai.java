/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.hitung.nilai;

public class LogicNilai {

   private String NIM,NM;
    private double Quiz,Tugas,Mid,Final;

    public void setNIM(String no){
        NIM=no;
    }
    public void setNM(String nama){
        NM=nama;
    }
    public void setQuiz(double c){
        Quiz=c;
    }
    public void setTugas(double d){
        Tugas=d;
    }
    public void setMid(double e){
        Mid=e;
    }
    public void setFinal(double f){
        Final=f;
    }
    public String getNS(){
        return(NIM);
    }
    public String getNM(){
        return(NM);
    }
    public double getQuiz(){
        return(Quiz);
    }
    public double getTugas(){
        return(Tugas);
    }
    public double getMid(){
        return(Mid);
    }
    public double getFinal(){
        return(Final);
    }
    public double getNA(){
        return((0.1*getTugas()) + (0.25*getQuiz()) + (0.25*getMid()) + (0.25*getFinal()));
    }
    
    public String getHM(){
        if (getNA() >= 80) {
            return("A");
        }else if (getNA() >= 70) {
            return("B");
        }else if (getNA() >= 60) {
            return("C");
        }else if (getNA() >= 50) {
            return("D");
        }else{
            return("E");
        }
    }
    public String getKet(){
       if (null == getHM()) {
           return("Tidak Lulus");
       }else switch (getHM()) {
            case "A":
                return("Lulus");
            case "B":
                return("Lulus");
            case "C":
                return("Lulus");
            case "D":
                return("Lulus");
            default:
                return("Tidak Lulus");
        } 
    }
    
}
