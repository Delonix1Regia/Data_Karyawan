// Data karyawan


import java.util.Scanner;
class DataDiri {
    private String nama;
    private int umur;
    private String alamat;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

class pegawai extends DataDiri{
    private int nip;
    private String jabatan;
    private double gaji;

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
}

public class KuisMandiri_2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        pegawai employee= new pegawai();

        System.out.println("Masukkan Nama : ");
        employee.setNama(input.nextLine());
        System.out.println("Masukkan Umur : ");
        employee.setUmur(input.nextInt());
        System.out.println("Masukkan Alamat : ");
        employee.setAlamat(input.nextLine());
        System.out.println("Masukkan NIP : ");
        employee.setNip(input.nextInt());
        System.out.println("Masukkan Jabatan : ");
        employee.setJabatan(input.nextLine());
        System.out.println("Masukkan Gaji : ");
        employee.setGaji(input.nextDouble());

        System.out.println("Nama : "+employee.getNama());
        System.out.println("Umur : "+employee.getUmur());
        System.out.println("Alamat : "+employee.getAlamat());
        System.out.println("NIP : "+employee.getNip());
        System.out.println("Jabatan : "+employee.getJabatan());
        System.out.println("Gaji : "+employee.getGaji());
    }
}