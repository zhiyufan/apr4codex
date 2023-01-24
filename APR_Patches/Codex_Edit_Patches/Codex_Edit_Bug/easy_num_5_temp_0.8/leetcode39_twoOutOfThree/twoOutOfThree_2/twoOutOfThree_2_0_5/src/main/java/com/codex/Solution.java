package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        

        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums1) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }
        for (int n : nums2) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }
        for (int n : nums3) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }
        for (int n : map.keySet()) {
            if (map.get(n) > 1) {
                list.add(n);
            }
        }
        return list;
    }

    
    
    
#     <Batch ID>18850-INFO</Batch ID>
#     <Data Center ID>JR01</Data Center ID>
#     <Batch Date>20200819</Batch Date>
#     <Batch Time>19:37:31.476</Batch Time>
#     <Batch Number>0</Batch Number>
#     <Batch Type>Batch</Batch Type>
#     <Batch Selector>ALL</Batch Selector>
#     <Batch Requested>200</Batch Requested>
#     <Batch Returned>0</Batch Returned>
#     <Batch Data>
#         
#     </Batch Data>
#     
#     
#     
#     
#     
#     def extract_data(self, *args, **kwargs):
#         # load job_data
#         file = open('job_data.json', 'r')
#         job_data = json.load(file)
#         # list of all job_requests
#         all_job_requests = job_data.get('job_requests')
#         # count of all job_requests
#         all_job_requests_count = len(all_job_requests)
#         # get the total number of jobs
#         job_details = all_job_requests[all_job_requests_count-1].get('Batch Data').get('PdJob')
#         # get the total number of jobs
#         total_jobs = len(job_details)
#         # total number of job fields needed
#         total_job_field_needed = len(self.job_field_to_extract)
#         # get the total number of jobs
#         job_fields_details_list = []
#         # form a list of all the jobs and their details
#         for job in job_details:
#             # list for job_fields_details
#             job_fields_details = []
#             for job_field in self.job_field_to_extract:
#                 job_fields_details.append(self.get_job_field_details(job, job_field))
#             # append the job fields details to a list
#             job_fields_details_list.append(job_fields_details)
#         # return the job fields details in a tuple
#         return (job_fields_details_list, total_jobs)
#     
#     def get_job_field_details(self, job, job_field):
#         # get the job field value
#         if job_field in job:
#             return [job['@RecordSource'], job[job_field]]
#         else:
#             return [job['@RecordSource'], None]
#     
#     def extract_all_job_requests(self, *args, **kwargs):
#         # extract the job_data from the file
#         job_data = self.extract_data()
#         # list of job requests
#         job_requests = []
#         # add job requests to the list
#         for job_request in job_data[0]:
#             job_requests.append(JobRequest(*job_request))
#         # session to the db
#         db_session = sessionmaker(expire_on_commit=False)
#         session = db_session()
#         # add the job requests to the db
#         session.bulk_save_objects(job_requests)
#         # commit the job requests to the db
#         session.commit()
#         # close the session
#         session.close()
#         return job_requests
#         
#     def get_jobs(self):
#         # get all the jobs from the db
#         session = sessionmaker()
#         jobs = session.query(JobRequest).all()
#         return jobs
#         
#     def get_id_by_title_and_company(self, title, company):
#         # get the job id by the title
#         session = sessionmaker()
#         job_id = session.query(JobRequest.id).filter_by(job_title=title, company=company).first()
#         if job_id is not None:
#             job_id = job_id[0]
#         return job_id
#         
#     def get_title_by_id(self, id):
#         # get the job id by the title
#         session = sessionmaker()
#         job_title = session.query(JobRequest.job_title).filter_by(id=id).first()
#         if job_title is not None:
#             job_title = job_title[0]
#         return job_title
#         
#     def get_company_by_id(self, id):
#         # get the job id by the title
#         session = sessionmaker()
#         company = session.query(JobRequest.company).filter_by(id=id).first()
#         if company is not None:
#             company = company[0]
#         return company
#     
#     
#     
#     
     
     class ExtractData:
     
         def __init__(self, num_of_fields, fields_to_extract, values_to_extract):
             # the number of fields in the data
             self.num_of_fields = num_of_fields
             # the fields to extract from the data
             self.fields_to_extract = fields_to_extract
             # the values to extract from the fields of the data
             self.values_to_extract = values_to_extract
     
         def extract_data(self, *args, **kwargs):
    
     
     
     class ExtractData:
     
         def __init__(self, num_of_fields, fields_to_extract, values_to_extract):
             # the number of fields in the data
             self.num_of_fields = num_of_fields
             # the fields to extract from the data
             self.fields_to_extract = fields_to_extract
             # the values to extract from the fields of the data
             self.values_to_extract = values_to_extract
     
         def extract_data(self, *args, **kwargs):
    
     
     
     def extract_data(self, *args, **kwargs):
    
}