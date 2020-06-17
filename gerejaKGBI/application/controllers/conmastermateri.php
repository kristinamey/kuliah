<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class conmastermateri extends CI_Controller {

	function __construct()
	{
		parent::__construct();
		$this->load->model('M_materi');
        $this->load->helper('url');
		if ($this->session->userdata('status') != "login") {
			redirect(base_url("login"));
		}
	}

	public function index()
	{
		$data['materi_gereja'] = $this->M_materi->tampil_data()->result();
		$this->load->view('headeradmin', $data);
		$this->load->view('mastermateri', $data);
		$this->load->view('footeradmin', $data);
	}

	public function add(){
	    $idMateri_gereja = $this->input->post('idMateri_gereja');

	    if($this->M_materi->cek_data($idMateri_gereja)->num_rows() != 0){
	        $this->M_materi->ubah_data($idMateri_gereja);	  
	    }else {        
            $config['upload_path'] 	= './image/';
			$config['allowed_types'] = 'gif|jpg|png|pdf|doc';
			//$config['max_size'] = 30000;

			$this->load->library('upload', $config);
			
			if (! $this->upload->do_upload('rangkuman_materi')) {
				echo "Gagal upload bosku";
			} else {
				$file_data = $this->upload->data();
				$file_name = $file_data['file_name'];
				$this->M_materi->tambah_data($file_name);
			}
        }
	}

    public function hapus(){
        $idMateri_gereja = $this->input->post('idMateri_gereja1');
        $this->M_materi->hapus_data($idMateri_gereja);
            
    }
}
?>