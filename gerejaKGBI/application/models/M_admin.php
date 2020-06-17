<?php 
 //belum diedit
class M_admin extends CI_Model{

	function tampil_data(){
		return $this->db->get('admin');
    }
    function cek_data($id){
        return $this->db->get_where('admin', array('idAdmin' => $id));
    }
    function tambah_data() {
        $nama_admin = $this->input->post('nama_admin');
		$noHp = $this->input->post('noHp');
        $username = $this->input->post('username');
        $katasandi = md5($this->input->post('katasandi'));
        
 
		$data = array(
			'nama_admin' => $nama_admin,
			'noHp' => $noHp,
            'username' => $username,
            'katasandi' => $katasandi,
			);
		$this->db->insert('admin', $data);
		redirect('../gerejaKGBI/conkaryawan');
    }
  
    function ubah_data ($idAdmin) {
		$nama_admin = $this->input->post('nama_admin');
		$noHp = $this->input->post('noHp');
        $username = $this->input->post('username');
        $katasandi = $this->input->post('katasandi');
 
		$data = array(
			'nama_admin' => $nama_admin,
			'noHp' => $noHp,
            'username' => $username,
            'katasandi' => $katasandi,
			);

		$this->db->where(array('idAdmin' => $idAdmin));
		$this->db->update('admin', $data);
		redirect('../gerejaKGBI/conkaryawan');
	}
	
	function hapus_data ($idAdmin) {
		$this->db->where(array('idAdmin' => $idAdmin));
		$this->db->delete('admin');
		redirect('../gerejaKGBI/conkaryawan');
    }

}