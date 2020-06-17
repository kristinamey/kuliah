<?php 
class M_berita extends CI_Model{

	function tampil_data(){
		return $this->db->get('berita_gereja');
    }
    function cek_data($id){
        return $this->db->get_where('berita_gereja', array('idBerita_gereja' => $id));
    }
    function tambah_data($file_name) {
        $judul_berita = $this->input->post('judul_berita');
		$deskripsi_berita = $this->input->post('deskripsi_berita');
        $gambar_berita = 'image/'.$file_name;
 
		$data = array(
			'judul_berita' => $judul_berita,
			'deskripsi_berita' => $deskripsi_berita,
            'gambar_berita' => $gambar_berita,
			);
		$this->db->insert('berita_gereja', $data);
		redirect('../gerejaKGBI/conmasterberita');
    }
  
    function ubah_data ($idberita_gereja) {
    	$post = $this->input->post();
		$judul_berita = $this->input->post('judul_berita');
		$deskripsi_berita = $this->input->post('deskripsi_berita');
        $gambar_berita ='image/'.$this->input->post('gambar_berita');

		$data = array(
			'judul_berita' => $judul_berita,
			'deskripsi_berita' => $deskripsi_berita,
            'gambar_berita' => $gambar_berita,
			);

		$this->db->where(array('idBerita_gereja' => $idberita_gereja));
		$this->db->update('berita_gereja', $data);
		redirect('../gerejaKGBI/conmasterberita');
	}
	
	function hapus_data ($idberita_gereja) {
		$this->db->where(array('idBerita_gereja' => $idberita_gereja));
		$this->db->delete('berita_gereja');
		redirect('../gerejaKGBI/conmasterberita');
    }

}