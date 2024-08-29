public class Student {
        
        int absen;
    String nama;
    double ipk;

    public int getAbsen() {
        return this.absen;
    }

    public void setAbsen(int absen) {
        this.absen = absen;
    }

    public String getNama() {
		return this.nama;
	}

    public void setNama(String nama) {
		this.nama = nama;
	}

    public double getIpk() {
        return this.ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

        //Constructor
        //nama harus sama dengan Class
        public Student() {
            absen = 0;
            nama = "empty";
            ipk = 0.0;
        }

        //Constructor Parameter (input dari user)
        public Student(int absen, String nama, double ipk) //ini parameter 
            {
                //variable = parameter
                this.absen = absen;
                this.nama = nama;       //kalo gamau pake this, pake nama parameter dan variable berbeda. Tetapi lebih umum pake this.
                this.ipk = ipk;
            } 

            //method print - to show the results of set data
            public void print() {
                System.out.println("Absen: " + absen);
                System.out.println("Nama: " + nama);
                System.out.println("IPK: " + ipk);
            }
            
    }
    
