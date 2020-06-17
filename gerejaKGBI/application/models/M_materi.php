<?php 
class M_materi extends CI_Model{

	function tampil_data(){
		return $this->db->get('materi_gereja');
    }
    function cek_data($id){
        return $this->db->get_where('materi_gereja', array('idMateri_gereja' => $id));
    }
    function tambah_data($file_name) {
        $tema_kotbah = $this->input->post('tema_kotbah');
		$tanggal = $this->input->post('tanggal');
        $pemateri = $this->input->post('pemateri');
        $rangkuman_materi = 'image/'.$file_name;
 
		$data = array(
			'tema_kotbah' => $tema_kotbah,
			'tanggal' => $tanggal,
            'pemateri' => $pemateri,
            'rangkuman_materi' => $rangkuman_materi,
			);

		$this->db->insert('materi_gereja', $data);
		redirect('../gerejaKGBI/conmastermateri');
    }
  
    function ubah_data ($idmateri_gereja) {
    	$post = $this->input->post();
		$tema_kotbah = $this->input->post('tema_kotbah');
		$tanggal = $this->input->post('tanggal');
        $pemateri = $this->input->post('pemateri');
        $rangkuman_materi = 'image/'.$this->input->post('rangkuman_materi');
 
		$data = array(
			'tema_kotbah' => $tema_kotbah,
			'tanggal' => $tanggal,
            'pemateri' => $pemateri,
            'rangkuman_materi' => $rangkuman_materi,
			);

		$this->db->where(array('idMateri_gereja' => $idmateri_gereja));
		$this->db->update('materi_gereja', $data);
		redirect('../gerejaKGBI/conmastermateri');
	}
	
	function hapus_data ($idmateri_gereja) {
		$this->db->where(array('idMateri_gereja' => $idmateri_gereja));
		$this->db->delete('materi_gereja');
		redirect('../gerejaKGBI/conmastermateri');
    }
}