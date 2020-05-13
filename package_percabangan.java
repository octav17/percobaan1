package percabangan;
public class Percabangan {
    public static void main(String[] args) {
        int x=3;
        switch (x){
            case 1:
                System.out.println("nilai x = 1");
                break;
            case 2:
                System.out.println("nilai x = 2");
                break;
            case 3:
                System.out.println("nilai x = 3");
                break;
            default:
                System.out.println("nilai a tidak di katahui");
        }
    }
    private void bt_hasilActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        switch(pilih){
        case 1:
            bil2 = Double.parseDouble(String.valueOf(txt_hasil.getText()));
            jumlah = bil1+bil2;
            bilangan = Double.toString(jumlah);            
            break;
        case 2:
            bil2 =Double.parseDouble(String.valueOf(txt_hasil.getText()));
            jumlah = bil1 - bil2;
            bilangan = Double.toString(jumlah);            
            break;
        case 3:
            bil2 = Double.parseDouble(String.valueOf(txt_hasil.getText()));
            jumlah = bil1 * bil2;
            bilangan = Double.toString(jumlah);            
            break;
        case 4:
            bil2 = Double.parseDouble(String.valueOf(txt_hasil.getText()));
            jumlah = bil1 / bil2;
            bilangan = Double.toString(jumlah);            
            break;  
        }
        txt_hasil.setText(bilangan);
    }
    private void bt_0ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        bil +="nilai"; // nilai ganti dengan angka 0, 1, 1         
        txt_hasil.setText(bil); // menampilkan angka kedalam jTextField
    }
}
/**
 * Compares two {@code int} values numerically.
 * The value returned is identical to what would be returned by:
 * <pre>
 *    Integer.valueOf(x).compareTo(Integer.valueOf(y))
 * </pre>
 *
 * @param  x the first {@code int} to compare
 * @param  y the second {@code int} to compare
 * @return the value {@code 0} if {@code x == y};
 *         a value less than {@code 0} if {@code x < y}; and
 *         a value greater than {@code 0} if {@code x > y}
 * @since 1.7
 */