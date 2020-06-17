<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class conmasterberita extends CI_Controller {

	function __construct()
	{
		parent::__construct();
		$this->load->model('M_berita');
        $this->load->helper('url');
		if ($this->session->userdata('status') != "login") {
			redirect(base_url("login"));
		}
	}

	public function index()
	{
		$data['berita_gereja'] = $this->M_berita->tampil_data()->result();
		$this->load->view('headeradmin', $data);
		$this->load->view('masterberita', $data);
		$this->load->view('footeradmin', $data);
	}

	public function add(){
	    $idBerita_gereja = $this->input->post('idBerita_gereja');

	    if($this->M_berita->cek_data($idBerita_gereja)->num_rows() != 0){
	        $this->M_berita->ubah_data($idBerita_gereja);	  
	    }else {        
            $config['upload_path'] 	= './image/';
			$config['allowed_types'] = 'jpg|gif|png|jpeg';
			//$config['max_size'] = 30000;

			$this->load->library('upload', $config);
			
			if (! $this->upload->do_upload('gambar_berita')) {
				echo "Gagal upload bosku";
			} else {
				$file_data = $this->upload->data();
				$file_name = $file_data['file_name'];
				$this->M_berita->tambah_data($file_name);
			}
		}
    }

        public function hapus(){
            $idberita_gereja = $this->input->post('idberita_gereja1');
            $this->M_berita->hapus_data($idberita_gereja);
                
        }
}
?>
