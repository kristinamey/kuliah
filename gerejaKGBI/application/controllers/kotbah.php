<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class kotbah extends CI_Controller {

	function __construct()
	{
		parent::__construct();
		$this->load->model('M_materi');
        $this->load->helper('url');
	}

	public function index()
	{
		$data['materi_gereja'] = $this->M_materi->tampil_data()->result();
		$this->load->view('header', $data);
		$this->load->view('kotbah', $data);
		$this->load->view('footer', $data);
	}
}
?>